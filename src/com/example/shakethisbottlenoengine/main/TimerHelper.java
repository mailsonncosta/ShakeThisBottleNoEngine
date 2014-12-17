package com.example.shakethisbottlenoengine.main;

/**
 * Simple class that implements time counting.
 * @author Ítalo
 *
 */
public class TimerHelper {
	
	private long initialTime;

	/**
	 * Starts counting when called.
	 */
	public TimerHelper() 
	{
		// TODO Auto-generated constructor stub
		initialTime = System.currentTimeMillis();
	}
	
	public double getElapsedTimeInSeconds()
	{
		long currentTime = System.currentTimeMillis();
		long delta = currentTime - initialTime;
		double elapsedSeconds = delta / 1000.0;
		return elapsedSeconds;
	}

	public long getInitialTime() 
	{
		return initialTime;
	}

}
