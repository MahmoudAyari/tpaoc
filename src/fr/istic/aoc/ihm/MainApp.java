package fr.istic.aoc.ihm;

import java.io.IOException;
import java.net.URL;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.Moteur.MoteurImpl;
import fr.istic.aoc.controller.Controller;
import fr.istic.aoc.controller.ControllerImpl;
import fr.istic.aoc.view.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class MainApp extends Application {

	public static MoteurImpl moteur;
	public static Controller controller;
	public static View view;

	public static MoteurImpl getMoteur() {
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
			moteur = new MoteurImpl();
			controller= new ControllerImpl(moteur);
			view = fxmlLoader.<View>getController();
			
			
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
