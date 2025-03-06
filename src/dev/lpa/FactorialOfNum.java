package dev.lpa;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 //5 = 5 * 4* 3 * 2 * 1 = 120
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:- ");
		
		int value = sc.nextInt();
		
		int factorial = value;
		
		for(int i=value-1; i>=1; i--) {
			
			factorial = factorial * i ;		
		}
		
		 System.out.println("factorial Of a Given Number is " + factorial);
		
	}

	  
}
