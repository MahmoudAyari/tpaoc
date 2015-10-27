package fr.istic.aoc.command;

import fr.istic.aoc.Materiel.Materiel;

public class Tic implements Command {

	
	
	
	public void execute() {
		// TODO Auto-generated method stub
		Materiel.getEmetteurSonore().emettreClic();
	}

}
