package fr.istic.aoc.command;

import fr.istic.aoc.controller.Controller;

public class MarquerTemps implements Command{

private Controller controller;
	
	
	public MarquerTemps(Controller controller) {
		super();
		this.controller = controller;
	}
	
	
	public void execute() {
		this.controller.marquerTemps();
	}

}
