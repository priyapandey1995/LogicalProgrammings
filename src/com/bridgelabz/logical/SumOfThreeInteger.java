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
public class SumOfThreeInteger {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/** to add the three array elements
		 * to print the numbers are distinct
		 * 
		 */
	
		Scanner sc = new Scanner(System.in);
	       
        System.out.println("Total numbers are ?");
        int n = sc.nextInt();
       
        int arr[] = new int[n];
       
        System.out.println("Enter your numbers");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
       
        for(int i = 0;i<n;i++) {
           
            for(int j = 0;j<n;j++) {
               
                for(int k = 0;k<n;k++) {
                   
                    if(arr[i]+arr[j]+arr[k] == 0) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                        else 
                    	System.out.println("numbers are not equal");
                    
                }
               
            }
           
        }
       
        sc.close();
    }
	}


