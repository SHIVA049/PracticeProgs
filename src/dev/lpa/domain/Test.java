package dev.lpa.domain;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;



public class Test 
{ 
	/*public Test() 
	{ 
		System.out.printf("1"); 
		new Test(10); 
		System.out.printf("5"); 
	} 
	public Test(int temp) 
	{ 
		System.out.printf("2"); 
		new Test(10, 20); 
		System.out.printf("4"); 
	} 
	public Test(int data, int temp) 
	{ 
		System.out.printf("3"); 
		
	}  */
	
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		float b=sc.nextFloat();
		long c=sc.nextLong();
		byte d=sc.nextByte();
		
		sc.nextLine();
		String s=sc.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		
		a = a + 10;
		System.out.println(a);
	} 
	
	
	

}
	

	


