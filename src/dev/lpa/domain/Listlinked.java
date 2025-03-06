package dev.lpa.domain;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Listlinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 /* int number = 100;

	        int sum = 0;

	        while (number >= 0) {

	            sum += number % 10;

	            number /= 10;
	        }
	        System.out.println(sum);
	        
	        String S="Geeks"; */
	        
		/*Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i+=2){
            
            System.out.print(s.charAt(i));
        } */
		
		/*for(int i=1; i<=4; i++) {
			
			for(int j=1;j<=4;j++) {
				
				//.out.print("*"+" ");
				
				if(i==1 || i == 4 || j==1 || j==4) {
					
					System.out.print("*");
					
				}else
				  System.out.print(" ");
			}
			
			System.out.println();
		} */
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		/*int i=1;
        int n = sc.nextInt();
        
        do{
          System.out.println("Geeksforgeeks");  
          i++;
        }while(n >= i); */
		
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                System.out.print("*"+" ");
            }
            
            System.out.println();
            
        }
        	
        
		/*int[] arr= {3,2,1};
		System.out.println(insertion(arr)); */
		
		/*LinkedList<Integer> list=new LinkedList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(4);
		
		LinkedListTraversal(list); */
		
		//System.out.println(josephus(10,2));
		
		//insertRemove();
		/*for(; ; ){

	       } *
	    
		/*int[] arr= {5,9,11,13,11,5,10,9};
		
	    Arrays.stream(arr).distinct().forEach(x->System.out.print(x+" "));
	    System.out.println();
	    System.out.println(Arrays.stream(arr).filter(x->x%5==0).sum());
	    System.out.println(Arrays.stream(arr).anyMatch(x->x%3==0));
	    System.out.println(Arrays.stream(arr).allMatch(s->s%3==0));
	    System.out.println(Arrays.stream(arr).average());
	    System.out.println(Arrays.stream(arr).count());
	    Arrays.stream(arr).map(x->x+x).forEach(x->System.out.print(x+" "));
	    System.out.print("\n");
	    System.out.println(Arrays.stream(arr).max());
	    int[] arr1=Arrays.stream(arr).sorted().distinct().toArray();
	    System.out.println(arr1.length);
	    
	    //arr1.distinct().forEach(x->System.out.print(x+" "));
	    System.out.println(arr1);
	    String[] arr2= {"Cabbage","Cucumber","Tomato","Carrot"};
	    
	    System.out.println(Arrays.stream(arr2).filter(s->s.equalsIgnoreCase("Cabbage"))
	    .count());
	    
	    Arrays.stream(arr2).sorted().forEach(s->System.out.print(s+" "));
	    
	   List<String> al=Arrays.asList("Test","Get","Front","Back","Kill","skill"); */
	   
	   //al.stream().filter(s->s.equalsIgnoreCase("test")).forEach(x->(x+"Method"));
			   
	   //System.out.println(sb.length());
	    //Arrays.stream(arr2).
	    
				//System.out.println(avgUsingStreams(arr));
		//System.out.println(filterUsingStreams(arr));

	}
	
	
	
	
	
	public static double avgUsingStreams(int[] arr) {
	    // Your code here
	    // Use stream().average().getAsDouble()
	    // Just return and don't typecase anything.
	    
	    return Arrays.stream(arr).average().getAsDouble();
	   
	   //return sum / arr.length;
	}
	
	public static int filterUsingStreams(int[] arr) {
	    // Your code here
	    // Use filter() to get only odd elements then apply max().getAsInt()
		
		return Arrays.stream(arr).filter(x->x%2 != 0).max().getAsInt();
	}

	
	public static LinkedList<Integer> insertion(int arr[]) {
		
		LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			list.add(arr[i]);
			
		} 
		
		/*list.add(1);
		list.add(2);
		list.add(3);
		list.add(-14); */
		
		return list;
		
		// System.out.println(list.remove(-14));
	    // Your code here	
	}
	
	public static void insertRemove() {
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(-14);
		
		 System.out.println(list.remove(-14));
	}
	
	public static void LinkedListTraversal(LinkedList<Integer> list) {
	    // Your code here
		
		int n=list.size();
		for(int i=0;i<n;i++) {
			
			System.out.print(list.get(i)+" ");
		}
	    
	    
	}
	
	public static int josephus(int n, int k)
	{
		
		LinkedList<Integer> list=new LinkedList<>();
		
		
		for(int i=0;i<n;i++) {
			list.add(i);
		}
		
		Iterator<Integer> it = list.iterator();
		 
		while(list.size()>1) {
				int count = 1;
			while(count < k ) 
			{	
				while(it.hasNext() && count <= k)
				{				
				  it.next();
				  count++;
			    }
		    if(count < k) {
		    	it=list.iterator();
		    	it.next();
		    	count++;
		    }
		    it.remove();
				
		    }

	}
		
		
		return list.getFirst();
	
}
	
}
