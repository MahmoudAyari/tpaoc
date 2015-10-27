package fr.istic.aoc.view;


import fr.istic.aoc.ihm.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class View {
	
	
	@FXML
	private TextField afficheur;
	
	@FXML
	private Circle led1;
	
	@FXML 
	private Circle led2;
	
	@FXML
	private Slider slider;
	
	
	@FXML
	private void onStart(ActionEvent e){
		MainApp.getController().start();
	}

	@FXML
	private void onStop(ActionEvent e){
		MainApp.getController().stop();
	}
	
	@FXML
	private void onDec(ActionEvent e){
		MainApp.getController().decMesure();
	}
	
	@FXML
	private void onInc(ActionEvent e){
		MainApp.getController().incMesure();
	}
	
	@FXML
	private void onSliderChanged(MouseEvent e){
		
		MainApp.getController().updateTempo();
	}

	public TextField getAfficheur() {
		return afficheur;
	}

	public void setAfficheur(TextField afficheur) {
		this.afficheur = afficheur;
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

	
}
