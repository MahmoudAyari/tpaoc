package v2.Materiel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClavierImpl implements Clavier,KeyListener{

	// ihm et constructeur 
	
	
	public boolean touchePres(int i) {
		return false;
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		char Caract = e.getKeyChar();
		System.out.println("char" + Caract);
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
