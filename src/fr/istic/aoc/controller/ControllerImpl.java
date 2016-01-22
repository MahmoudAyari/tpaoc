package fr.istic.aoc.controller;

import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.Moteur.MoteurImpl;
import fr.istic.aoc.command.Command;
import fr.istic.aoc.command.MarqueMesure;
import fr.istic.aoc.command.MarquerTemps;
import fr.istic.aoc.command.Tic;
import fr.istic.aoc.view.Ihm;
import fr.istic.aoc.view.View;
import v2.Materiel.Horloge;
import v2.Materiel.HorlogeImpl;
import v2.Materiel.Materiel;

public class ControllerImpl implements Controller {
	
	private final int  MIN_MOLETTE=40;
	private final int  MAX_MOLETTE=240;
	
	private final int TEMPO_LED = 0;
	private final int BAR_LED = 1;
	
	
	private Moteur moteur;
	
	public Ihm ihm;
	
//	public  Materiel materiel ;
	
	public ControllerImpl(){
		
	}
	
	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public Ihm getIhm() {
		return ihm;
	}

	public void setIhm(Ihm ihm) {
		this.ihm = ihm;
	}

	public ControllerImpl(Moteur moteur,View view) {
		super();
		this.moteur = moteur;
		this.ihm=view;
	}


	
	public void start() {
		if(!this.moteur.getEtat()){
			this.moteur.setEtat(true);
			}
		
	}

	public void stop() {
		if(this.moteur.getEtat()){
			this.moteur.setEtat(false);
		}
	}

	public void marquerTemps() {
		this.ihm.allumerLed(TEMPO_LED);
		try {
			Thread.sleep(70);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.ihm.etendreLed(TEMPO_LED);
		
	}
	
	public void tic(){
		this.ihm.emettreClic();
	}

	public void marquerMesure() {
		this.ihm.allumerLed(BAR_LED);
		try {
			Thread.sleep(70);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.ihm.etendreLed(BAR_LED);
		
	}

	public void updateTempo() {
		float tempo = (float)((MAX_MOLETTE-MIN_MOLETTE)*(ihm.getSlider().getValue()/100)+MIN_MOLETTE);
		if(tempo != this.moteur.getTempo()){
		this.moteur.setTempo(tempo);
		this.ihm.afficherTempo(tempo);
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
		this.ihm.afficherMesure(mesure);
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
			this.ihm.afficherMesure(mesure);
			if(this.moteur.getEtat()){
				stop();
				start();
				}
			}
	}

	public View getView() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setView(Ihm view) {
		// TODO Auto-generated method stub
		
	}


}
