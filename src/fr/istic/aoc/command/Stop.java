package fr.istic.aoc.command;

import fr.istic.aoc.controller.Controller;

public class Stop implements Command {

	
	private Controller controller;
	
	
	public Stop(Controller controller) {
		super();
		this.controller = controller;
	}


	public void execute() {
		this.controller.stop();
	}

}
