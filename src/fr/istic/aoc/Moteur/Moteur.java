package fr.istic.aoc.Moteur;

import fr.istic.aoc.command.Command;

public interface Moteur {
	
	public int getTempo();
	
	public void setTempo(int tempo);
	
	public boolean getEnMarche();
	
	public void setEnMarche(boolean enMarche);
	
	public void setCmdMarquerTemps(Command cmd);
	
	public void setCmdMarquerMesure(Command cmd);
	
	
	

}
