package fr.istic.aoc.command;

import fr.istic.aoc.controller.Controller;

public class Decrement implements Command{

private Controller controller;
	
	public Decrement(Controller controller) {
		super();
		this.controller = controller;
	}
	
	public void execute() {
		this.controller.decMesure();
		
	}

}
