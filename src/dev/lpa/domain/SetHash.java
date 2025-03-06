package dev.lpa.domain;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]= {1, 2, 3, 5, 6};
		//int b[]= {8,7,9};
		System.out.print(unique_substring("jaja"));
		//System.out.print(sumExists(arr,14));

	}
	
	
	public static int countOnce(int arr[]) {
	    // Your code here
	    
	    HashSet<Integer> hs=new HashSet<>();
	    int count=0;
	    for(int s:arr) {
	    	if(!hs.contains(s)) {
	    		count++;
	    		hs.add(s);
	    	}
	    	
	    }
	    
	    return count;
	}
	
	public static int sumExists(int arr[], int sum) {
        // Your code here, Geeks
		
		HashSet<Integer> hs=new HashSet<>();
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(hs.contains(sum-arr[i])) {
				count=1;
				break;
			}
			
			hs.add(arr[i]);
		}
		
		return count;
    }
	
	public static int findUnion(int a[], int b[]) {
        // code here
		
		HashSet<Integer> hs1=new HashSet<>();
		//HashSet<Integer> hs2=new HashSet<>();
		//int size=0;
		
		for(int i=0;i<a.length;i++) {
			hs1.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			hs1.add(b[i]);
			
		}
		
		return hs1.size();		
    }
	
	public static int unique_substring(String s) {
		
		HashSet<String> ss=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String str=s.substring(i, j);
				if(ss.contains(str)==false) {
					ss.add(str);
					//System.out.print(ss+" ");
				}
			}
			
		}
		
		//System.out.print(false);
		return ss.size();
        // Your code here
    }
	
	public static int numberofElementsInIntersection(int a[], int b[]) {
		
		//HashSet<Integer> hs=new HashSet<>();
		int count=0;
		HashSet<Integer> hs1=new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			hs1.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			if(hs1.contains(b[i]))
				count++;
		}
		
		return count;
        // Your code here
    }


}
