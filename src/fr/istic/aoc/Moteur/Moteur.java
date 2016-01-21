package fr.istic.aoc.Moteur;

import fr.istic.aoc.command.Command;
import fr.istic.aoc.controller.Controller;
import v2.Materiel.Horloge;

public interface Moteur {
	
	public float getTempo();
	
	public void setTempo(float tempo);
	
	public boolean getEtat();
	
	public void setEtat(boolean enMarche);
	
	public void setCmdMarquerTemps(Command cmd);
	
	public void setCmdMarquerMesure(Command cmd);
	
	public void setCmdTic(Command cmd);
	
	public void setNbTemps(int nbTemps) ;
	
	public int getNbTemps();

	public void cmdMarquerTemps();
	
	public void cmdMarquerMesure();
	
	public void tick();
	
	public Horloge getHorloge();
	
	public void setHorloge(Horloge horloge);
	
	
}
