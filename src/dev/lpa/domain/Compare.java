package dev.lpa.domain;

import java.util.Arrays;
import java.util.Comparator;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] arr= {"week", "GEEKS"};
         sortByComparator(arr);
	}
	
	
	public static void sortByComparator(String[] arr) {
	   
		Arrays.sort(arr, String::compareToIgnoreCase);
		
		
		String[] arr1=Arrays.toString(arr).split(",");
		
		for(String s: arr1) {
			System.out.print(s+" ");
		}
		
		
	}

}
