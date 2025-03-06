package dev.lpa.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mapps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //int arr[] = { 10, 20, 10, 10, 20 };
	        //printFrequencieslinkMap(arr);
		/*HashMap<Integer,Integer> hm=new HashMap<>();
		add_Value(hm,1,10);
		System.out.println(hm);
		System.out.println(find_value(hm,2)); */
		//System.out.println();
		/*String[] arr= {"Modi", "Kejriwal", "Modi", "Jayanth", "Modi", "Kejriwal", "Bharat"};
		System.out.println(electionWinner(arr)); */
		//String[] arr= {"Kallu", "Mallu", "Rajnath","Kallu","Mallu","Mallu"};
		//System.out.println(frequencyCount(arr));
		//System.out.println(countNonRepeated(arr));
		//System.out.println(firstRepeated(arr));
		//System.out.println(TieBreak(arr));
		int[] a= {3, 6, 1, 7, 9, 8, 2, 2};
		int[] b= {9, 7, 3, 4, 9};
		System.out.println(commonElements(a,b));
		
		}
	
	public static void printFrequencies(int[] arr) {
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		for(Map.Entry x : map.entrySet()) {
			System.out.println(x.getKey() + " "
                    + x.getValue());
		}
	}
	
	public static void printFrequencieslinkMap(int[] arr) {
		
		Map<Integer,Integer> linkedmap=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			linkedmap.put(arr[i], linkedmap.getOrDefault(arr[i], 0) + 1);
		}
		
		for(Map.Entry x : linkedmap.entrySet()) {
			
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}
	
	public static void add_Value(HashMap<Integer,Integer> hm, int x, int y)
    {
	//Your code here
	      hm.put(x,y);
    }
	
	public static int find_value(HashMap<Integer, Integer> hm, int x)
    {
        //Your code here
		boolean flag=false;
        if(hm.containsKey(x)) {
        	return hm.get(x);
        }else {
        	return -1;
        }
    }
	
	public static String electionWinner(String arr[]) {
		
		int winner=0;
		String winner1="";
		Map<String,Integer> map=new TreeMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
		}
		
		for(Map.Entry x: map.entrySet()) {
			//System.out.println(x.getKey() + " "
            //       + x.getValue());
			int a=(int)x.getValue();
			String b=(String)x.getKey();
			if(a>winner) {
				winner = a;
				winner1 = b;
			}
						
		}
		
	    // map.get(winner));
		return winner1;
		
		//return ((TreeMap<String, Integer>) map).
		//return ((TreeMap<String, Integer>) map).lastEntry().getKey(); 
		
    }
	
	public static ArrayList<Integer> frequencyCount(int arr[]) {
	    // Your code here
		
		ArrayList<Integer> al=new ArrayList<>();
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
		}
	    
		for(Map.Entry x:map.entrySet()) {
			int a=(int)x.getValue();
			al.add(a);
		}
	    return al;
	}
	
	public static int countNonRepeated(int arr[]) {
        // add your code
		int count=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
		}
		
		for(Map.Entry x:map.entrySet()) {
			//System.out.println(x.getKey()+" "+x.getValue());
			int a=(int)x.getValue();
			if(a==1) {
				count++;
			}
		}
		return count;
    }
	
	public static boolean findsum(int arr[]) {
        // Your code here
		
		
		return false;
    }
	
	 public static int firstRepeated(int[] arr) {
	        // Your code here
		 int b=0;
		 int c=0;
		 int a=0;
		 
		 Map<Integer,Integer> map=new LinkedHashMap<>();
			for(int i=0;i<arr.length;i++) {
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
				
			}
			
			for(Map.Entry x:map.entrySet()) {
	
				a=(int)x.getValue();
				 c=(int)x.getKey();
				
				if(a>1) {
					
					
					for(int i=0;i<arr.length;i++) {
						  if(arr[i]==c) {
							  b=i;
							  break;
						  }
					  }
					   return b+1;
					 }else {
						 b=-1;
					 }
						
				}
				
		    return b;
	 }
		
	 public static String TieBreak(String arr[]) {
		
		 int winner=0;
			String winner1="";
			Map<String,Integer> map=new TreeMap<>();
			for(int i=0;i<arr.length;i++) {
				map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
			}
			
			for(Map.Entry x: map.entrySet()) {
				//System.out.println(x.getKey() + " "
	            //       + x.getValue());
				int a=(int)x.getValue();
				String b=(String)x.getKey();
				if(a>winner) {
					winner = a;
					winner1 = b;
				}
							
			}
		 
		 return winner1;
	        // Your code here
	    }
	 
	 public static ArrayList<Integer> commonElements(int a[], int b[]) {
	        // Your code here
		 
		TreeMap<Integer,Integer> tmp=new TreeMap<>();
		 ArrayList<Integer> al=new ArrayList<>();
		 //int[] a= {3,4,2,2,4};
		 for(int i=0;i<b.length;i++) {
			 for(int j=0;j<a.length;j++) {
				 if(b[i]==a[j]) {
					 if(!al.contains(a[i]))
					 al.add(b[i]);
				 }
			 }
			 
		 } 
		 Collections.sort(al);
		 
		 return al;  
		/* ArrayList<Integer> al=new ArrayList<>();
		 HashSet<Integer> hs1=new HashSet<>();
		 for(int i=0;i<a.length;i++) {
			 hs1.add(a[i]);
		 }
		 for(int i=0;i<b.length;i++) {
			 hs1.add(b[i]);
		 } */
	    }  
}
