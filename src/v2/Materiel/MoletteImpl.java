package v2.Materiel;

import fr.istic.aoc.ihm.MainApp;
import v2.View;

public class MoletteImpl implements Molette {

	
	View view;
	
	public MoletteImpl(View view){
		this.view=view;
	}
	public float position() {
		// TODO Auto-generated method stub
		return (float) view.getSlider().getValue();
	}

}