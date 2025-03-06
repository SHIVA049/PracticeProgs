package dev.lpa;

import java.util.ArrayList;

public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alkhya");
		names.add("Anil");
		names.add("Akhilesh");
		names.add("Pradeep");
		names.add("Shukla");
		
		for(int i=0; i<names.size();i++) {
			
			if(names.get(i).startsWith("D")) {
				
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}
