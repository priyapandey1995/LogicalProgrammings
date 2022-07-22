package com.bridgelabz.logical;

import java.util.Scanner;

/**
 * 
 * @author pande
 *
 */
public class fibonacci {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * Initializing two variables as 0 and 1
		 * taking input from the user
		 * add the both the numbers in a variables by next
		 * adding the second variable to first and next to second
		 * this continues till it satisfies the given range
		 * 
		 * 
		 */
		int y=1,next;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range");
		int n = sc.nextInt();
		System.out.println("The fibonacci Series are:-");
		for(int x=0;x<=n;) {
			System.out.println(x);
			next = x+y;
			x=y;
			y=next;
		}
		
		
	}

}
