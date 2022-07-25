package com.bridgelabz.logical;

import java.util.Scanner;

/**
 * 
 * @author pande
 *
 */
public class Distance {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * Distance from the origin to co-ordinates
		 * take user input for variable x and y
		 * apply the formula to calculate distance
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		double calculateDistance;
		System.out.println("Enter the value for x:");
		Double x = sc.nextDouble();
		System.out.println("Enter the value for y:");
		Double y = sc.nextDouble();
		
		calculateDistance=Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("the distance from the origin to co-ordinate is"+calculateDistance);
		sc.close();
	}

}
