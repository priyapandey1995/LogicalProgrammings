package com.bridgelabz.logical;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in); 
		long elapsed=0;
		System.out.println("Enter any charcater to start ");
		char s = sc.next().charAt(0);   
		long startTime = System.nanoTime(); 
		System.out.println("Starting Time is" +" " +startTime);
		System.out.println("Enter any chareater to stop");
		char c = sc.next().charAt(0);
		long stopTime = System.nanoTime();
		System.out.println("Stoping time is" + " " +stopTime);
		elapsed=stopTime-startTime;
		System.out.println("elasped time is"+ " " + elapsed/1000 + "seconds");
		

	}

}
