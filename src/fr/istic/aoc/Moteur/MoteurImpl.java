package fr.istic.aoc.Moteur;

import fr.istic.aoc.command.AllumerLed;
import fr.istic.aoc.command.Command;
import fr.istic.aoc.command.Tic;

public class MoteurImpl implements Moteur {
	
	private int tempo;
	private Command tic;
	private Command allumerLed1;
	private Command allumerLed2;
	
	

	public MoteurImpl() {
		
		tic= new Tic();
		allumerLed1= new AllumerLed(0);
		allumerLed2= new AllumerLed(1);
		
	}

	public int getTempo() {
		// TODO Auto-generated method stub
		return tempo;
	}

	public void setTempo(int tempo) {
		// TODO Auto-generated method stub
		
	}

	public boolean getEnMarche() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setEnMarche(boolean enMarche) {
		// TODO Auto-generated method stub
		
	}

	public void setCmdMarquerTemps(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	public void setCmdMarquerMesure(Command cmd) {
		// TODO Auto-generated method stub
		
	}

}
