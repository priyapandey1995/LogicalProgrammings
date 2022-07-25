package com.bridgelabz.logical;

import java.util.Scanner;

/**
 * 
 * @author pande
 *
 */
public class WindChill {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * to check the wind,
		 * temperature and velocity value is are taken from the user input
		 * wind is calculated using the formula
		 * then checks for condition to be true within the range to print the windchill
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int v,t;
		System.out.println("Enter the veloity");
		v = sc.nextInt();
		System.out.println("Enter the temperature");
		t = sc.nextInt();
		
		double w = ( 35.74+(0.6215 * t ) + ((0.4275 * t )-35.75 )* Math.pow(v ,0.16 )); 
		if(t>50 || v>120 || v<3) {
			System.out.println("values are not in range");
		}
		else {
			System.out.println("wind chill is:"+w);
		}
	}

}
