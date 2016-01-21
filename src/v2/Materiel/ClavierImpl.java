package v2.Materiel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import v2.View;

public class ClavierImpl implements Clavier{

	
	View view;
	
	public ClavierImpl(View view){
		this.view=view;
	}
	
	public boolean touchePres(int i) {
		//return view.tabButton[i].isActive();
		return true;
	}

	


}
