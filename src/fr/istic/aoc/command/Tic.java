package fr.istic.aoc.command;


import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.controller.Controller;

public class Tic implements Command {

	private Controller controller;
	
	
	public Tic(Controller controller) {
		super();
		this.controller = controller;
	}


	public void execute() {
		this.controller.tic();
	}

}
