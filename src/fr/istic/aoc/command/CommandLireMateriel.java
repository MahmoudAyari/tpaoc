package fr.istic.aoc.command;

import fr.istic.aoc.controller.Controller;

public class CommandLireMateriel implements Command {

private Controller controller;
	
	
	public CommandLireMateriel(Controller controller) {
		super();
		this.controller = controller;
	}


	public void execute() {
		//this.controller.lireMateriel();
	}
}
