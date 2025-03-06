package dev.lpa;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Limit :- ");
		int value = sc.nextInt();
		
		System.out.println("List of Odd numbers between 1 and "+ value+ " are");
		
		for(int i=1; i<=value; i++) {
			
			if(i % 2 != 0) {
				
		        System.out.print( i + " ");
			}
		}

	}

}
