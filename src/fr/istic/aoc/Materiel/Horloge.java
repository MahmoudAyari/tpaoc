package fr.istic.aoc.Materiel;

import fr.istic.aoc.command.Command;

public interface Horloge {

	void activerPeriodiquement(Command command, float periode);
	
	void activerApresDelai(Command command, float delai);
	
	void desactiver(Command command);
}
