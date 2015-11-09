package fr.istic.aoc.test;

import fr.istic.aoc.Materiel.Materiel;
import fr.istic.aoc.Moteur.Moteur;
import fr.istic.aoc.Moteur.MoteurImpl;
import fr.istic.aoc.ihm.MainApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMoteur {

	public static Moteur m ;
	
	//Test unitaire
	
	 @Before
	    public  void avantTest() {
	        m = new MoteurImpl();
	    }
	 
	 @Test
		public  void testGetEtat() {
		 assertEquals(m.getEtat(),false);
		}
	 
	@Test
		public  void testSetEtat() {
			m.setEtat(true);
			assertEquals(m.getEtat(),true);
		}
	
	@Test
	public  void testSetTempo() {
		m.setTempo(60);
	 assertEquals(m.getTempo(),60,0);
	}
	
	@Test
	public  void testGetTempo() {
	 assertEquals(m.getTempo(),40,0);
	}
	
	@Test
	public  void testSetTemps() {
		m.setNbTemps(5);
	 assertEquals(m.getNbTemps(),5,0);
	}
	
	@Test
	public  void testGetTemps() {
	 assertEquals(m.getNbTemps(),3,0);
	}
	
	
	 
	 @After
	    public void apresTest() {
	    }
	 
	 
}
