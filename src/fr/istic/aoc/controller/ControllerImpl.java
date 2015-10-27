package fr.istic.aoc.controller;

import fr.istic.aoc.Materiel.Horloge;
import fr.istic.aoc.Materiel.HorlogeImpl;
import fr.istic.aoc.Moteur.Moteur;

public class ControllerImpl implements Controller {
	
	private Moteur moteur;
	private Horloge horloge;
	
	
	

	public ControllerImpl(Moteur moteur) {
		super();
		this.moteur = moteur;
		this.horloge = new HorlogeImpl();
		
	}

	public void start() {
		this.moteur.setEtat(true);
		
	}

	public void stop() {
		this.moteur.setEtat(false);
		
	}

	public void marquerTemps() {
		// TODO Auto-generated method stub
		
	}

	public void marquerMesure() {
		// TODO Auto-generated method stub
		
	}

	public void updateTempo(float tempo) {
		this.moteur.setTempo(tempo);
		
	}

	public void incMesure() {
		this.moteur.setNbTemps(this.moteur.getNbTemps()+1);
		
	}

	public void decMesure() {
		this.moteur.setNbTemps(this.moteur.getNbTemps()-1);
		
		
	}

}
