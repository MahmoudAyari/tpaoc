package fr.istic.aoc.Materiel;

import fr.istic.aoc.ihm.MainApp;

public class AfficheurImpl  implements Afficheur{

	public void allumerLed(int numLed) {
		// TODO Auto-generated method stub
		
	}

	public void etendreLed(int numLed) {
		// TODO Auto-generated method stub
		
	}

	public void afficherTempo(int valeurTempo) {
		MainApp.getView().getTemps().setText("Tempo : "+valeurTempo);
	}

	public void afficherMesure(int valeurMesure) {
		MainApp.getView().getMesure().setText("Mesure : "+valeurMesure);
		
	}

}
