package fr.istic.aoc.command;

import fr.istic.aoc.controller.Controller;

public class Increment implements Command{

	private Controller controller;
	
	public Increment(Controller controller) {
		super();
		this.controller = controller;
	}
	
	public void execute() {
		this.controller.incMesure();
		
	}

}
