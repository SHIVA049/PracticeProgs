package dev.lpa;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int K=1;
		
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4-i;j++) {
				
				System.out.print(K);
				System.out.print(" ");
				K++;
			}
			
			System.out.println();
		}
		

	}

}
