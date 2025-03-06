package dev.lpa;

import java.util.Scanner;

public class Comp2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:- ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second Number:- ");
		int num2 = sc.nextInt();
		
		if(num1 == num2 ) {
			
			System.out.println(num1 + " and " + num2 + " are equal" );
		}else if( num1 > num2 ) {
			
			System.out.println(num1 + " is greater than " + num2 );
			
		}else if( num2 > num1 ) {
			 
			System.out.println(num2 + " is greater than " + num1 );
			
		}

	}

}
