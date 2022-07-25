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
public class TwoDArray {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * to display in 2d array
		 * taking elements in row and column wise
		 * creating array object of 2d array 
		 * displaying array elements
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the size of columns");
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array elements are:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
		sc.close();
	}
}
