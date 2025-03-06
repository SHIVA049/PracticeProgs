package dev.lpa;

import java.util.Scanner;

public class InverstTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number of Your Choice : ");
		
		int num = sc.nextInt();
				
	 //for(int i=0; i<=6; i++) {
		while(num > 0) {
		 
		 for(int j=1; j<=num; j++) {
			 
			 System.out.print(" "+ num + " ");
		 }
		 
		 System.out.println("\n");
		 
		 num--;
	  }

	}

}
