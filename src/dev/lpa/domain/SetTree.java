package dev.lpa.domain;

import java.util.ArrayList;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {12,18,5,11,30,5};
        //System.out.print(insert(arr));
		//display(insert(arr));
        //System.out.print(uniqueSorted(arr));
		//System.out.print(Sorted_Characters("abdbc"));
        System.out.print(subarraySum(arr,69));
		
	}
	
	public static TreeSet<Integer> insert(int arr[]) {
	   
	    TreeSet<Integer> set = new TreeSet<>();
	    for(int s:arr) {
	    	set.add(s);
	    }
	    
	    return set;
	    
	}
	
	public static void display(TreeSet<Integer> s) {
	    // Your code here
	    for(int x:s) {
	    	System.out.print(x+" ");
	    }	    
	}
	
	public static void erase(TreeSet<Integer> s, int x) {
	    // Your code here
	  if(s.contains(x)) {
		  s.remove(x);
		  System.out.println("erased "+x);
	  }else {
		  System.out.println("not found");
	  }
	    
	}
	
	public static ArrayList<Integer> uniqueSorted(int arr[]) {
		
		TreeSet<Integer> set=new TreeSet<>();
		//Object[] arr1=new Object[]
		ArrayList<Integer> al=new ArrayList<>();
		for(int x:arr) {
			set.add(x);
		}
	     al.addAll(set);
		return al;
        // Your code here
    }
	
	public static String Sorted_Characters(String s) {
		
		TreeSet<String> set=new TreeSet<>();
		char strt;
		String abs="";
		int n=s.length();
		for(int i=0;i<n;i++) {
			char a=s.charAt(i);
			String as=Character.toString(a);
			set.add(as);
		}
		
		
		String str=set.toString().replaceAll(",", "");
		String st=str.replaceAll(" ", "");
		
		
		/*for(int i=0;i<st.length();i++) {
			strt=st.charAt(i);
			abs=abs+Character.toString(strt);
		} */
			
		return st;
		
	    // Your code here
	}
	
	static ArrayList<Integer> subarraySum(int[] arr, int target) {
		
		ArrayList<Integer> al=new ArrayList<>();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			     sum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==target) {
					al.add(i+1);
					al.add(j+1);
					break;
				}
			}
			
			if(al.size()>0)
			break;
		}
		
		return al;
        // code here
    }

}
