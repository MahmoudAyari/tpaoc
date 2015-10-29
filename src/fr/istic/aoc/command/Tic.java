package fr.istic.aoc.command;


import fr.istic.aoc.Moteur.Moteur;

public class Tic implements Command {

	Moteur moteur;
	
	
	public Tic(Moteur moteur) {
		super();
		this.moteur = moteur;
	}


	public void execute() {
		// TODO Auto-generated method stub
		moteur.tick();
	}

}
