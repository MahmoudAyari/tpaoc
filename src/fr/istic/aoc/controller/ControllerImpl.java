package fr.istic.aoc.controller;

import fr.istic.aoc.Materiel.Horloge;
import fr.istic.aoc.Materiel.HorlogeImpl;
import fr.istic.aoc.Materiel.Materiel;
import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.Moteur.MoteurImpl;
import fr.istic.aoc.command.Command;
import fr.istic.aoc.command.MarqueMesure;
import fr.istic.aoc.command.MarquerTemps;
import fr.istic.aoc.command.Tic;

public class ControllerImpl implements Controller {
	
	private final int  MIN_MOLETTE=40;
	private final int  MAX_MOLETTE=240;
	
	private final int TEMPO_LED = 0;
	private final int BAR_LED = 1;
	
	
	private Moteur moteur;
	
	private Command marquerTemps;
	private Command marquerMesure;
	private Command tic;
	

	public ControllerImpl(Moteur moteur) {
		super();
		marquerMesure = new MarqueMesure(this);
		marquerTemps= new MarquerTemps(this);
		tic= new Tic(this);
		this.moteur = moteur;
		this.moteur.setCmdMarquerMesure(marquerMesure);
		this.moteur.setCmdMarquerTemps(marquerTemps);
		
		
	}


	
	public void start() {
		if(!this.moteur.getEtat()){
			this.moteur.setEtat(true);
			Materiel.getHorloge().activerPeriodiquement(tic, this.moteur.getTempo());
			Materiel.getHorloge().activerPeriodiquement(marquerTemps, this.moteur.getTempo());
			Materiel.getHorloge().activerPeriodiquement(marquerMesure, this.moteur.getTempo()*this.moteur.getNbTemps());	
		}
		//this.moteur.start();
		
	}

	public void stop() {
		if(this.moteur.getEtat()){
			this.moteur.setEtat(false);
			Materiel.getHorloge().desactiver(tic);
			Materiel.getHorloge().desactiver(marquerTemps);
			Materiel.getHorloge().desactiver(marquerMesure);	
		}
		//this.moteur.setEtat(false);
		
	}

	public void marquerTemps() {
		
		Materiel.getAfficheur().allumerLed(TEMPO_LED);
		try {
			Thread.sleep(70);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Materiel.getAfficheur().etendreLed(TEMPO_LED);
		
	}
	
	public void tic(){
		Materiel.getEmetteurSonore().emettreClic();
	}

	public void marquerMesure() {
		Materiel.getAfficheur().allumerLed(BAR_LED);
		try {
			Thread.sleep(70);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Materiel.getAfficheur().etendreLed(BAR_LED);
		
	}

	public void updateTempo() {
		float tempo = ((MAX_MOLETTE-MIN_MOLETTE)*(Materiel.getMolette().position()/100)+MIN_MOLETTE);
		if(tempo != this.moteur.getTempo()){
		this.moteur.setTempo(tempo);
		Materiel.getAfficheur().afficherTempo(tempo);
		if(this.moteur.getEtat()){
		stop();
		start();
		}
		}
		
	}

	public void incMesure() {
		
		int mesure = this.moteur.getNbTemps()+1;
		if (mesure >= 2 && mesure <= 7) {
		this.moteur.setNbTemps(mesure);
		Materiel.getAfficheur().afficherMesure(mesure);
		if(this.moteur.getEtat()){
			stop();
			start();
			}
		}
		
	}

	public void decMesure() {
		int mesure = this.moteur.getNbTemps()-1;
		if (mesure >= 2 && mesure <= 7) {
			this.moteur.setNbTemps(mesure);
			Materiel.getAfficheur().afficherMesure(mesure);
			if(this.moteur.getEtat()){
				stop();
				start();
				}
			}
	}

}
