package fr.istic.aoc.Materiel;

import java.applet.Applet;

public class EmetteurSonoreImpl implements EmetteurSonore {

	java.net.URL url = getClass().getResource("/son/Bleep.mp3");
	java.applet.AudioClip audio = Applet.newAudioClip(url);

	public void emettreClic() {
		audio.play();
	}

}
