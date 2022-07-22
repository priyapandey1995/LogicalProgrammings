package com.bridgelabz.logical;
/**
 * 
 * @author pande
 *
 */
public class StopWatch {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * Initializing elapsed=0
		 * by using nanoTime() capturing the system start and stop time
		 * calculating elapsed time by applying formula
		 */
		long elapsed=0;
		
		long startTime = System.nanoTime(); 
		System.out.println("Starting Time is" +" " +startTime);
		
		 
		long stopTime = System.nanoTime();
		System.out.println("Stoping time is" + " " +stopTime);
		
		elapsed=stopTime-startTime;
		System.out.println("elasped time is"+ " " + elapsed/1000 + "seconds");
		

	}

}
