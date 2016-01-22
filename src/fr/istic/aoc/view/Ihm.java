package fr.istic.aoc.view;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javafx.application.Platform;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public interface Ihm {


	
	public void allumerLed(int numLed) ;

	public void etendreLed(int numLed) ;

	public void afficherMesure(int valeurMesure) ;

	public void afficherTempo(float valeurTempo) ;
	
	public void emettreClic();

	public Slider getSlider();
}
