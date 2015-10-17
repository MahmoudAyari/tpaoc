package fr.istic.aoc.ihm;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public final class Ihm extends Application {

	  @Override
	  public void start(final Stage primaryStage) {
	    try {
	      // Localisation du fichier FXML.
	      final URL url = getClass().getResource("Ihm.fxml");
	      // Création du loader.
	      final FXMLLoader fxmlLoader = new FXMLLoader(url);
	      // Chargement du FXML.
	      final AnchorPane root = (AnchorPane) fxmlLoader.load();
	      // Création de la scène.
	      final Scene scene = new Scene(root, 600, 250);
	      primaryStage.setScene(scene);
	    } catch (IOException ex) {
	      System.err.println("Erreur au chargement: " + ex);
	    }
	    primaryStage.setTitle("Métronome");
	    primaryStage.show();
	  }

	  public static void main(String[] args) {
	    launch(args);
	  }
	}
