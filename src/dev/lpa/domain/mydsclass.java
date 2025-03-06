package dev.lpa.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class mydsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*TreeMap<Integer,List<String>> tmp=new TreeMap<>();
		myDS md=new myDS();
		tmp=md.add(20, "Cabbage");
		tmp=md.add(30, "Banana");
		tmp=md.add(20,"Apple");
		tmp=md.add(20, "Coroander");
		System.out.println(tmp); */
		//int[] arr= {10,5,8,20,30,8};
		//greaterElements(arr);
		/*TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(6);
		ts.add(5);
		ts.add(7);
		ts.add(8);
		ts.add(1);
		ts.add(2);
				
		TreeSet<Integer> hdset = new TreeSet<Integer>();
		hdset = (TreeSet<Integer>)ts.headSet(6);
		Iterator itr = hdset.iterator();
		while(itr.hasNext())
		{
		   System.out.print(itr.next() + " ");
		} */
		/*ArrayList<Integer> al= new ArrayList<>();
		al.add(4);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(4);
		System.out.println(maximumSum(al));*/
		int[] arr1= {1,2,3};
		int[] arr2= {5,4,2};
		
		System.out.println(hasSubset(arr1,arr2));


	}
	
	public static void greaterElements(int[] arr) {
		
		TreeMap<Integer,Integer> gelm=new TreeMap<>(Collections.reverseOrder());
		for(int x:arr) {
			//System.out.println(gelm.tailMap(arr[i]));
			gelm.put(x, gelm.getOrDefault(x,0)+1);
			
		}
		//System.out.println(gelm);
		
		int cumFreq=0;
		for(Map.Entry<Integer,Integer> e:gelm.entrySet()) {
			int temp=e.getValue();
			gelm.put(e.getKey(),cumFreq);
			
			cumFreq=cumFreq+temp;
		}
		//System.out.println(gelm);
		
		
		for(int x:arr) {
			System.out.print(gelm.get(x)+" ");
		}
		
		
	}
	
	public static int maximumSum(ArrayList<Integer>arr)
	{
	    //Your code here
	    HashSet<Integer> set=new HashSet<>();
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    
	    int prefixSum=0; 
	    //Integer[] a=(Integer[]) arr.toArray();
	    
	    for(int x:arr) {
	 	    	
	    	prefixSum += x;
	    	set.add(prefixSum);	    	
	    }	     
	        System.out.println(set);
	    	return prefixSum;    
	    
	}
	
	public static boolean hasSubset(int[] arr1, int[] arr2)
	{
		HashSet<Integer> set=new HashSet<>();
		//HashSet<Integer> set1=new HashSet<>();
		boolean flag=false;
		
		for(int x:arr1) {
			set.add(x);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				flag=true;
			}
		}
		
		if(flag==true) {
			return true;
		}else
		return false;
	    //Your code here
	}

}
