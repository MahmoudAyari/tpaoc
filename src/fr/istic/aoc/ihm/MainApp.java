package fr.istic.aoc.ihm;

import java.io.IOException;
import java.net.URL;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.Moteur.MoteurImpl;
import fr.istic.aoc.command.Command;
import fr.istic.aoc.command.Decrement;
import fr.istic.aoc.command.Increment;
import fr.istic.aoc.command.MarqueMesure;
import fr.istic.aoc.command.MarquerTemps;
import fr.istic.aoc.command.Start;
import fr.istic.aoc.command.Stop;
import fr.istic.aoc.command.Tic;
import fr.istic.aoc.controller.Controller;
import fr.istic.aoc.controller.ControllerImpl;
import fr.istic.aoc.view.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public  class MainApp extends Application {

	public static Moteur moteur;
	public static Controller controller;
	public static View view;

	public static Moteur getMoteur() {
		return moteur;
	}

	public static Controller getController() {
		return controller;
	}

	public static View getView() {
		return view;
	}
	
	@Override
	public void start(final Stage primaryStage) {
		try {
			// Localisation du fichier FXML.
			final URL url = getClass().getResource("Ihm.fxml");
			// Création du loader.
			final FXMLLoader fxmlLoader = new FXMLLoader(url);
			// Chargement du FXML.
			final Pane root = (Pane) fxmlLoader.load();
			// Création de la scène.
			final Scene scene = new Scene(root, 600, 250);
			primaryStage.setScene(scene);
			view = fxmlLoader.<View>getController();
			moteur = new MoteurImpl();
			controller= new ControllerImpl(moteur);
			
			Command cmdMarquerTemps = new MarquerTemps(controller);
			moteur.setCmdMarquerTemps(cmdMarquerTemps);
			
			Command cmdMarquerMesure = new MarqueMesure(controller);
			moteur.setCmdMarquerMesure(cmdMarquerMesure);
			
			Command cmdTic = new Tic(controller);
			moteur.setCmdTic(cmdTic);
			
			Command cmdStart = new Start(controller);
			view.setCmdStart(cmdStart);
			
			Command cmdStop = new Stop(controller);
			view.setCmdStop(cmdStop);
			
			Command cmdInc = new Increment(controller);
			view.setCmdIncr(cmdInc);
			
			Command cmdDec = new Decrement(controller);
			view.setCmdDec(cmdDec);
			
			
			
			
		} catch (IOException ex) {
			System.err.println( ex.toString());
		}
		primaryStage.setTitle("Métronome");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
