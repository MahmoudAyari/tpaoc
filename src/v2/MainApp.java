package v2;

import java.io.IOException;
import java.net.URL;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.Moteur.MoteurImpl;
import fr.istic.aoc.command.Command;
import fr.istic.aoc.command.CommandLireMateriel;
import fr.istic.aoc.command.Decrement;
import fr.istic.aoc.command.Increment;
import fr.istic.aoc.command.MarqueMesure;
import fr.istic.aoc.command.MarquerTemps;
import fr.istic.aoc.command.SliderChange;
import fr.istic.aoc.command.Start;
import fr.istic.aoc.command.Stop;
import fr.istic.aoc.command.Tic;
import fr.istic.aoc.controller.Controller;
import fr.istic.aoc.controller.ControllerImpl;
import v2.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import v2.Materiel.Horloge;
import v2.Materiel.HorlogeImpl;
import v2.Materiel.Materiel;

public  class MainApp extends Application {

	public static Moteur moteur;
	public static Controller controller;
	public static View view;
	Adapter adapter ;
	

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
			view =new View();
			view = fxmlLoader.<View>getController();
			adapter =new ConcreteAdapter(view,controller);
			moteur = new MoteurImpl();
			
			
			controller= new ControllerImpl();
			
			controller.setMoteur(moteur);
			controller.setIhm(adapter);
			
			adapter = new ConcreteAdapter(view, controller);
			
			view.setAdapter(adapter);
			
			Command commandLireMateriel = new CommandLireMateriel(adapter);
			
			Horloge horloge = new HorlogeImpl();
			horloge.activerPeriodiquement(commandLireMateriel, (float) 0.05);
			
			
			Command cmdMarquerTemps = new MarquerTemps(controller);
			moteur.setCmdMarquerTemps(cmdMarquerTemps);
			
			Command cmdMarquerMesure = new MarqueMesure(controller);
			moteur.setCmdMarquerMesure(cmdMarquerMesure);
			
			Command cmdTic = new Tic(controller);
			moteur.setCmdTic(cmdTic);
			
			Command cmdStart = new Start(adapter);
			view.setCmdStart(cmdStart);
			
			Command cmdStop = new Stop(adapter);
			view.setCmdStop(cmdStop);
			
			Command cmdInc = new Increment(adapter);
			view.setCmdIncr(cmdInc);
			
			Command cmdDec = new Decrement(adapter);
			view.setCmdDec(cmdDec);
			
			Command cmdSlider = new SliderChange(controller);
			view.setCmdSlider(cmdSlider);
			
			view.afficherMesure(moteur.getNbTemps());
			
			view.afficherTempo(moteur.getTempo());
			
			
			
			
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
