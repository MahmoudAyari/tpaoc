package fr.istic.aoc.Moteur;

import fr.istic.aoc.Materiel.Horloge;
import fr.istic.aoc.Materiel.HorlogeImpl;
import fr.istic.aoc.Materiel.Materiel;
import fr.istic.aoc.command.AllumerLed;
import fr.istic.aoc.command.Command;
import fr.istic.aoc.command.Tic;
import fr.istic.aoc.controller.Controller;
import fr.istic.aoc.ihm.MainApp;

public class MoteurImpl implements Moteur {

	private float tempo;
	private Command tic;
	private Command allumerLed1;
	private Command allumerLed2;
	private boolean etat;
	private int nbTemps;
	private int nbTempsCourant;
	private Command marquerTemps;
	private Command marquerMesure;
	private Horloge horloge;
   
	public MoteurImpl() {

		
		allumerLed1 = new AllumerLed(0);
		allumerLed2 = new AllumerLed(1);
		this.etat = false;
		this.tempo = 60;
		this.nbTemps = 3;
		this.nbTempsCourant = 1;
		this.tic = new Tic(this);
		Materiel.getAfficheur().afficherMesure(nbTemps);
		Materiel.getAfficheur().afficherTempo(tempo);
	}

	public float getTempo() {
		return tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
		//MainApp.getController().marquerTemps(tempo);
		//Materiel.getAfficheur().afficherTempo(tempo);

	}

	public boolean getEtat() {
		return this.etat;
	}

	public void setEtat(boolean etat) {
		if (this.etat != etat) {
			this.etat = etat;
			if (this.etat == true) {
				if (this.horloge == null) {
				this.horloge = new HorlogeImpl();
				}
			}
			
			this.horloge.activerPeriodiquement(tic, 60 / tempo);
			
		} else {
			this.horloge.desactiver(tic);
		}
	}

	public void tick() {
		if (nbTempsCourant == nbTemps) {
			this.marquerMesure.execute();
			this.nbTempsCourant = 1;
		} else {
			this.marquerTemps.execute();
			this.nbTempsCourant++;
		}
	}
	

	public void setCmdMarquerTemps(Command cmd) {
		this.marquerTemps = cmd;
	}

	public void setCmdMarquerMesure(Command cmd) {
		this.marquerMesure = cmd;

	}

	public int getNbTemps() {
		return nbTemps;
	}

	public void setNbTemps(int nbTemps) {
		
			this.nbTemps = nbTemps;
		
	}

	public Horloge getHorloge() {
		return horloge;
	}

	public void setHorloge(Horloge horloge) {
		this.horloge = horloge;
	}



}
