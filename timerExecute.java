package com.testing.timers;

import java.util.Timer;
import java.util.TimerTask;

class timerContainer extends TimerTask
{
	public static int time=0;

	@Override
	public void run() {
		
		System.out.println("Task is working, seconds count = "+ time++);
	
			
	}
	
}


public class timerExecute {
	public static void main(String args[])
	{
		Timer timer=new Timer();
		TimerTask secondCount=new timerContainer();
		
		
		timer.schedule(secondCount , 2000, 5000);
		
		
			timer.cancel();
		
	}

}
