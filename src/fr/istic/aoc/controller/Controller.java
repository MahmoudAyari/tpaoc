package fr.istic.aoc.controller;

import fr.istic.aoc.Moteur.Moteur;

public interface Controller {

	
	public void start();
	
	public void stop();
	
	public void tic();
	
	public void marquerTemps();
	
	public void marquerMesure();
	
	public void updateTempo();
	
	public void incMesure();
	
	public void decMesure();
	
	//public void sliderChange();
	
	
	
	
	
}
