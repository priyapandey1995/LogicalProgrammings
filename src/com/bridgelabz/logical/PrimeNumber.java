package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * to calculate prime numbers:
		 * the number which is divide by 1 or itself
		 * loop is performed till the condition is satisfied
		 */
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i=2;i<n;i++) {
			
			if(n%i == 0) {
				count= count+1;
				
			}
			
		}
		if(count>0) {
			System.out.println("its not a prime");
		}
		else {
			System.out.println("its a prime number");
		}
		

	}

}
