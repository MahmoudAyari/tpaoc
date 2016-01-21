package v2;

import fr.istic.aoc.command.CommandLireMateriel;
import fr.istic.aoc.controller.Controller;
import v2.View;
import v2.Materiel.Horloge;

public class ConcreteAdapter implements Adapter{

	private Controller controller;
	private View view;
	
	private Horloge horloge;

	private boolean btnStart;//1
	private boolean btnStop;//2
	private boolean btnPlus;//3
	private boolean btnMinus;//4

	private float tempo;

	private CommandLireMateriel read;

	
	public void lireMateriel() {

		boolean oldBtnStart = btnStart;
		btnStart=view.getClavier().touchePres(1);
		if ((btnStart != oldBtnStart )&& btnStart) {
			controller.start();
		}


		boolean oldBtnStop = btnStop;
		btnStop=view.getClavier().touchePres(2);
		if ((btnStop != oldBtnStop )&& btnStop) {
			controller.stop();
		}

		boolean oldBtnPlus = btnPlus;
		btnPlus=view.getClavier().touchePres(3);
		if ((btnPlus != oldBtnPlus )&& btnPlus) {
			controller.incMesure();
		}

		boolean oldBtnMinus = btnMinus;
		btnMinus=view.getClavier().touchePres(4);
		if ((btnMinus != oldBtnMinus )&& btnMinus) {
			controller.decMesure();
		}

		float oldtempo = tempo;
		//permet de metre à jour uniquement quand on ne touche plus au slider
		//if(!ihm.sliderTempo.getValueIsAdjusting()){
			//permet de récuperer le vrai tempo
		tempo= view.getMolette().position()*240;
		System.out.println(tempo);
		//}
		if (tempo != oldtempo ) {
			controller.updateTempo();
		}

	}
}
