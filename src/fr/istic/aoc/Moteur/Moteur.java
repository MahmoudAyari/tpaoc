package fr.istic.aoc.Moteur;

import fr.istic.aoc.command.Command;

public interface Moteur {
	
	public float getTempo();
	
	public void setTempo(float tempo);
	
	public boolean getEtat();
	
	public void setEtat(boolean enMarche);
	
	public void setCmdMarquerTemps(Command cmd);
	
	public void setCmdMarquerMesure(Command cmd);
	
	
	public void setNbTemps(int nbTemps) ;
	
	public int getNbTemps();

}
