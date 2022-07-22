package com.bridgelabz.logical;
import java.util.Scanner;
/**
 * 
 * @author pande
 *
 */

	public class ReverseNumber {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * reversing a number.
		 * number is taken from the user and loop till the condition gets satisfied
		 */
		int rev=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
			while(num!=0) {
				rem = num%10;
				rev =rev*10+rem;
				num=num/10;
		
			
		}
			System.out.println("the reverse of given number is"+" " + rev);

}
}
