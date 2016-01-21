package fr.istic.aoc.test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.Moteur.MoteurImpl;
import fr.istic.aoc.controller.Controller;
import fr.istic.aoc.controller.ControllerImpl;
import fr.istic.aoc.view.View;
import v2.Materiel.Materiel;

public class TestController {

	Moteur m;
	Materiel ma;
	View v;
	Controller c;
	
	//Test unitaire
	
		 @Before
		    public  void avantTest() {
			 m = new MoteurImpl();
			 //ma = new Materiel();
		     c = new ControllerImpl(m,v);
		    }
		 
		 @Test
			public  void testStart() {
			 c.start();
			 assertEquals(m.getEtat(),true);
			}
		 
		 @Test
			public  void testStop() {
			 c.stop();
			 assertEquals(m.getEtat(),false);
			}
		 
		 @After
		    public void apresTest() {
		    }
}
