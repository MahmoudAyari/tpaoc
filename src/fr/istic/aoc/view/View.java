package fr.istic.aoc.view;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import fr.istic.aoc.command.Command;
import fr.istic.aoc.ihm.MainApp;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import v2.Materiel.Materiel;

public class View implements Ihm{
	
	private Command cmdStart;
	private Command cmdStop;
	private Command cmdIncr;
	private Command cmdDec;
	private Command cmdSlider;
	
	
	private final int TEMPO_LED = 0;
	private final int BAR_LED = 1;
	
	@FXML
	private TextField temps;
	
	@FXML
	private  TextField mesure;
	
	@FXML
	private Circle led1;
	
	@FXML 
	private Circle led2;
	
	@FXML
	private Slider slider;
	
	
	@FXML
	private void onStart(ActionEvent e){
		if(cmdStart != null){
			cmdStart.execute();
		}
		//MainApp.getController().start();
		//Materiel.getEmetteurSonore().emettreClic();
		//Materiel.getAfficheur().allumerLed(1);
	}

	@FXML
	private void onStop(ActionEvent e){
		if(cmdStop != null){
			cmdStop.execute();
		}
		//MainApp.getController().stop();
	}
	
	@FXML
	private void onDec(ActionEvent e){
		if(cmdDec != null){
			cmdDec.execute();
		}
		//MainApp.getController().decMesure();
	}
	
	@FXML
	private void onInc(ActionEvent e){
		if(cmdIncr != null){
			cmdIncr.execute();
		}
		//MainApp.getController().incMesure();
	}
	
	@FXML
	private void onSliderChanged(MouseEvent e){
		if(cmdSlider!= null){
		cmdSlider.execute();
		}
		//MainApp.getController().updateTempo();
	}

	

	public TextField getTemps() {
		return temps;
	}

	public void setTemps(TextField temps) {
		this.temps = temps;
	}

	public TextField getMesure() {
		return mesure;
	}

	public void setMesure(TextField mesure) {
		this.mesure = mesure;
	}

	public Circle getLed1() {
		return led1;
	}

	public void setLed1(Circle led1) {
		this.led1 = led1;
	}

	public Circle getLed2() {
		return led2;
	}

	public void setLed2(Circle led2) {
		this.led2 = led2;
	}

	public Slider getSlider() {
		return slider;
	}

	public void setSlider(Slider slider) {
		this.slider = slider;
	}

	public void setCmdStart(Command cmdStart) {
		this.cmdStart = cmdStart;
	}

	public void setCmdStop(Command cmdStop) {
		this.cmdStop = cmdStop;
	}

	public void setCmdIncr(Command cmdIncr) {
		this.cmdIncr = cmdIncr;
	}

	public void setCmdDec(Command cmdDec) {
		this.cmdDec = cmdDec;
	}
	
	public void setCmdSlider(Command cmdSlider){
		this.cmdSlider = cmdSlider;
	}

	
	
	

	
	
	public void allumerLed(int numLed) {
		if(numLed==TEMPO_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					led1.setFill(Color.GREEN);
			    }
			});
		}
		else if(numLed==BAR_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					led2.setFill(Color.BLUE);
			    }
			});
		}
		
		
	}

	public void etendreLed(int numLed) {
		if(numLed==TEMPO_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					led1.setFill(Color.BLACK);
			    }
			});
		}
		else if(numLed==BAR_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					led2.setFill(Color.BLACK);
			    }
			});
		}
		
	}

	

	public void afficherMesure(int valeurMesure) {
		mesure.setText("Mesure : "+valeurMesure);
		
	}

	public void afficherTempo(float valeurTempo) {
		temps.setText("Tempo : "+valeurTempo);
		
	}
	
	public void emettreClic(){
		
		try{
			String url = "res/beep.wav";
			 AudioStream audioStream ;
				
			 InputStream in = new FileInputStream(url);
			  audioStream = new AudioStream(in);
			     AudioPlayer.player.start(audioStream);
			  }  catch (IOException ex) {
		            System.out.println("Error playing the audio file.");
		            ex.printStackTrace();
		        }
	}
}
