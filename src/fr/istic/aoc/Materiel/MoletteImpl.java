package fr.istic.aoc.Materiel;

import fr.istic.aoc.ihm.MainApp;

public class MoletteImpl implements Molette {

	public float position() {
		// TODO Auto-generated method stub
		return (float) MainApp.getView().getSlider().getValue();
	}

}
