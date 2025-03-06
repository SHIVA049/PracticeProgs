package dev.lpa.domain;

import java.util.Collections;
import java.util.LinkedList;

public class collectionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll= new LinkedList<>();
		int[] arr= {99,6,33};
		for(int i: arr) {
			ll.add(i);
		}
		
		Collections.rotate(ll,4);
		System.out.println(ll);
		
        
	}
	
	public static void rotateByK(LinkedList<Integer> ll, int k) {
	    // Your code here
	    // You don't need to print
	    
	    if(ll.size() >=1 && ll.size()<=Math.pow(10,3) && k >= 0){
	    Collections.rotate(ll,2);}
	    
	}


}
