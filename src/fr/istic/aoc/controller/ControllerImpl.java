package fr.istic.aoc.controller;

import fr.istic.aoc.Materiel.Horloge;
import fr.istic.aoc.Materiel.HorlogeImpl;
import fr.istic.aoc.Materiel.Materiel;
import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.Moteur.MoteurImpl;
import fr.istic.aoc.command.Command;
import fr.istic.aoc.command.MarqueMesure;
import fr.istic.aoc.command.MarquerTemps;

public class ControllerImpl implements Controller {
	
	private final int  MIN_MOLETTE=40;
	private final int  MAX_MOLETTE=240;
	
	
	private Moteur moteur;
	
	private Command marquerTemps;
	private Command marquerMesure;
	

	public ControllerImpl(Moteur moteur) {
		super();
		marquerMesure = new MarqueMesure(this);
		marquerTemps= new MarquerTemps(this);
		this.moteur = moteur;
		this.moteur.setCmdMarquerMesure(marquerMesure);
		this.moteur.setCmdMarquerTemps(marquerTemps);
		
		
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

	public void updateTempo() {
		this.moteur.setTempo((MAX_MOLETTE-MIN_MOLETTE)*Materiel.getMolette().position()+MIN_MOLETTE);
		
	}

	public void incMesure() {
		this.moteur.setNbTemps(this.moteur.getNbTemps()+1);
		
	}

	public void decMesure() {
		this.moteur.setNbTemps(this.moteur.getNbTemps()-1);
		
		
	}

}
