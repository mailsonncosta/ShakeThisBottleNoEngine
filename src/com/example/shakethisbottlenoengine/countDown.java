package com.example.shakethisbottlenoengine;

import java.util.TimerTask;

public class countDown extends TimerTask {
	private int sec;
	
	public countDown(int sec){
		this.sec=sec;
	}
	
	@Override
	public void run() {
		if(sec >0){/*{ try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/sec--;}
	}
	
	public int getSec(){return sec;}
}
