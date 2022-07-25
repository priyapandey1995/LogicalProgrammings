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
public class Quadratic {

	public static void main(String[] args) {
		/**
		 * to find the roots of equation
		 * two roots are obtained
		 * if the roots are checked for  <0,==0,>=0
		 */
		Double root1;
		Double root2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a");
		Double a=sc.nextDouble();
		
		System.out.println("Enter b");
		Double b=sc.nextDouble();
		
		System.out.println("Enter c");
		Double c=sc.nextDouble();
		Double delta = b*b-4*a*c;
		System.out.println("roots are:" + delta);

		if(delta>0) {
			System.out.println("Roots are not equal");
			root1 = (-b + Math.sqrt(delta))/(2*a);
			root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("roots are" + root1);
			System.out.println("roots are" +root2);
		}
		else if(delta==0) {
			System.out.println("roots are equal");
			root1=-b/(2*a);
			root2=-b/(2*a);
			System.out.println("roots are"+root1 );
			System.out.println("roots are"+root2);
		
		}
		else if(delta<0) {
			System.out.println("roots are Imaginary ");
			root1 = 0.0;
			root2 = 0.0;
			System.out.println("root1"+root1);
			System.out.println("root2"+root2);
		}
		
	}
}
	
	


