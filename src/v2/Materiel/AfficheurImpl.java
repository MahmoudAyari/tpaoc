package v2.Materiel;

import fr.istic.aoc.ihm.MainApp;
import javafx.application.Platform;
import javafx.scene.paint.Color;

public class AfficheurImpl  implements Afficheur{

	private final int TEMPO_LED = 0;
	private final int BAR_LED = 1;
	//MainApp mainApp = new MainApp();
	
	
	public void allumerLed(int numLed) {
		if(numLed==TEMPO_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					MainApp.getView().getLed1().setFill(Color.GREEN);
			    }
			});
		}
		else if(numLed==BAR_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					MainApp.getView().getLed2().setFill(Color.BLUE);
			    }
			});
		}
		
		
	}

	public void etendreLed(int numLed) {
		if(numLed==TEMPO_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					MainApp.getView().getLed1().setFill(Color.BLACK);
			    }
			});
		}
		else if(numLed==BAR_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					MainApp.getView().getLed2().setFill(Color.BLACK);
			    }
			});
		}
		
	}

	

	public void afficherMesure(int valeurMesure) {
		MainApp.getView().getMesure().setText("Mesure : "+valeurMesure);
		
	}

	public void afficherTempo(float valeurTempo) {
		MainApp.getView().getTemps().setText("Tempo : "+valeurTempo);
		
	}

}
