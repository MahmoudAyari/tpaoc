package fr.istic.aoc.command;

import fr.istic.aoc.controller.Controller;
import v2.Adapter;

public class CommandLireMateriel implements Command {

private Adapter adapter;
	
	
	public CommandLireMateriel(Adapter adapter) {
		super();
		this.adapter = adapter;
	}


	public void execute() {
		
		adapter.lireMateriel();
	}
}
