package ders03;

import java.util.Timer;
import java.util.TimerTask;

public class timerlar {
	static int sayac = 0;
	
	public static void main(String[] args) {
		//timer  = zamanlay�c�		
		Timer myTimer = new Timer();
		
		TimerTask gorev = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(sayac);
				sayac++;
				if(sayac==15) myTimer.cancel();
			}
		};
		
		myTimer.schedule(gorev, 0, 100);

	}

}
