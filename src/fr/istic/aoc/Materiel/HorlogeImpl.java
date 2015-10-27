package fr.istic.aoc.Materiel;

import java.util.Timer;
import java.util.TimerTask;

import fr.istic.aoc.command.Command;

public class HorlogeImpl implements Horloge{

	private Timer timer;
	private TimerTask taskTimer;
	
	
	
	public HorlogeImpl() {
		super();
		this.timer = new Timer();
	}

	public void activerPeriodiquement(Command command, float periode) {
		this.taskTimer = new periodicTask(command);
		this.timer = new Timer();
		this.timer.schedule(taskTimer, 0,(long)(periode*1000));
	}

	public void activerApresDelai(Command command, float delai) {
		this.taskTimer= new periodicTask(command);
		this.timer.schedule(taskTimer, (long)(delai*1000));
		
	}

	public void desactiver(Command command) {
		this.timer.cancel();
		
	}
	
	
	private class periodicTask extends TimerTask{

		
		Command cmd;
		
		public periodicTask(Command cmd) {
			super();
			this.cmd = cmd;
		}

		@Override
		public void run() {
			this.cmd.execute();
		}
		
	}

}
