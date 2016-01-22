package fr.istic.aoc.controller;

import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.view.Ihm;
import fr.istic.aoc.view.View;

public interface Controller {

	
	public void start();
	
	public void stop();
	
	public void tic();
	
	public void marquerTemps();
	
	public void marquerMesure();
	
	public void updateTempo();
	
	public void incMesure();
	
	public void decMesure();
	
	public Moteur getMoteur();

	public void setMoteur(Moteur moteur);

	public Ihm getView();

	public void setIhm(Ihm view);
	
	//public void lireMateriel();
	
	//public void sliderChange();
	
	
	
	
	
}
