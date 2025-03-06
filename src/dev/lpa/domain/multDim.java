package dev.lpa.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class multDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collfindMin();
	//List<Character> list = new ArrayList<>();
		//collfindMin();
		Integer[] arr= {1,3,4,5,6};
		
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arr));
		/*for(int s: arr) {
			list.add(s);
		}
		System.out.println(binarySearchAL(list, 2)); */
		
		Collections.reverse(list);
		System.out.println(list);
		
	}
	
	public static void multiDimen() {
		
		 int[][] mat= {{1,10,20},{15,25,35},{5,30,40}};
	        int len=(mat.length)*(mat.length);
	         //System.out.print(mat30,40}};
	        ArrayList<Integer> arr=new ArrayList<>();
	         for(int i=0;i<mat.length;i++) {
	        	 for(int j=0;j<mat.length;j++) {
	        		 //arr=mat[i][j];
	        		 arr.add(mat[i][j]);
	        	 }
	         }
	         
	         Object[] arr1=arr.toArray();
	         
	         int leng=arr1.length/2;
	         Arrays.sort(arr1);
	         System.out.println(Arrays.toString(arr1));
	         
	         System.out.println(arr1[leng]);
	}
	
	public static void collfindMin() {
		
		int[] arr= {1,2,3,2,2,6,7,8,9};
		
		List<Integer> al1=new ArrayList<Integer>();
		
		for(int a: arr) {
			al1.add(a);
		}
		
		System.out.println(Collections.min(al1));
		//Collections.reverse(al1);
		//System.out.println(al1);
		System.out.println(Collections.frequency(al1, 2));
		Collections.rotate(al1, 5);
		System.out.println(al1);
		Collections.rotate(al1, 5);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		Collections.swap(al1, 4, 5);
		System.out.println(al1);
		//Collections.fill(al1, 10);
		Collections.binarySearch(al1, 10);
		
	}
	
	public static void sortArrayList(ArrayList<Integer> list) {
		
		Collections.sort(list);
		
	}
	
	public static int binarySearchAL(ArrayList<Integer> list, int k) {
	    // Your code here
	    // If k in arr return 1, else return -1
	    
	    int x=Collections.binarySearch(list,k);
	    if(x>=0){
	       return x; 
	    }    
	    else{
	        return -1;
	    }
	}
	
	

}
