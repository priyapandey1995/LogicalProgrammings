package com.bridgelabz.logical;
/**
 * 
 */
import java.util.Scanner;
	/**
	 * 
	 * @author pande
	 *
	 */
public class PerfectNumbers {
      /**
       * 
       * @param args
       */
	public static void main(String[] args) {
		/**Input is taken from the user
		 * Modulus operator is performed to check for result
		 * All the divisor is stored in variable i and hence the sum is calculated
		 * entered number is then checked with sum,if its equal then the given
		 * number is perfect
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		int sum =0;
		
		for(int i=1;i<number;i++) {
			if(number%i == 0) {
				sum = sum + i;
			}
		}
		if(number == sum) {
			System.out.println("its a perfect number");
		}
			else {
				
				System.out.println("Not a Perfect Number");
		}

	}

}
