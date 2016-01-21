package v2.Materiel;

import java.io.*;
import sun.audio.*;



public class EmetteurSonoreImpl implements EmetteurSonore {

	
	public void emettreClic() {
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
