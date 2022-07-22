package com.bridgelabz.logical;

import java.util.Scanner;

/**
	 * 
	 * @author pande
	 *
	 */
public class CouponNumbers {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Distinct coupon number is found by generating four digit random number
		 * user input is taken till four digit
		 * coupon number is compared till a certain range
		 * then each user input is compared with random number
		 * if the number is matched then message is displayed
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the four digit numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		
		
		int couponNumber=1;
		
		while(couponNumber<999999) {
		couponNumber = 1000+(int)(Math.random()*9999);
		if(couponNumber == n1) {
			System.out.println("the numbers are matched"+ " "+n1);
			break;
		}
		else if(couponNumber == n2) {
			System.out.println("the numbers are matched"+" "+n2);
			break;
		}
		else if(couponNumber == n3) {
			System.out.println("the numbers are matched"+" "+n3);
			break;
		}
		else if(couponNumber == n4) {
			System.out.println("the numbers are matched"+" "+n4);
			break;
		}
		else if(couponNumber == n5) {
			System.out.println("the numbers are matched"+" "+n5);
			break;
		}
		}
	}
		
		
	}
  


