package fr.istic.aoc.controller;

public interface Controller {

	
	public void start();
	
	public void stop();
	
	public void marquerTemps();
	
	public void marquerMesure();
	
	
	public void updateTempo(float tempo);
	
	public void incMesure();
	
	public void decMesure();
	
	
	
	
	
}
