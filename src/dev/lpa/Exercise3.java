package dev.lpa;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100;
		int count=0;
		
		for(int i=num; i>=1;i--) {
			if(num % i == 0) {
				
				count++;
			
			}
			
			
			
		}
		
		if(count==2) {
			
			System.out.println(num + " is a prime Number");
		}
		else {
			
			System.out.println(num + " is not a prime Number");
			
		}

	}

}
