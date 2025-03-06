package dev.lpa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;




public class myDS {
	
	TreeMap<Integer,List<String>> m;
	
	myDS(){
		
		m=new TreeMap<>();
	}
	
	public TreeMap<Integer, List<String>> add(int price,String item) {
		
		if(m.get(price)==null) {
			
			m.put(price,new ArrayList<>());
			m.get(price).add(item);
		}else {
		
		m.get(price).add(item);
		}
		return m;
	}
	
	List<String> find(int price){
		return m.get(price);
	}
	
	public void printSorted() {
	    for(Map.Entry<Integer,List<String>> e:m.entrySet()) {
	    	int p=e.getKey();
	    	for(String s:e.getValue()) {
	    		System.out.print(s+" "+p);
	    	}
	    }
	}
	
	public void printGreaterSorted(int price) {
		
		SortedMap<Integer,List<String>> g=m.tailMap(price);
		for(Map.Entry<Integer, List<String>> e:g.entrySet()) {
			int p=e.getKey();
			for(String s:e.getValue()) {
				System.out.println(s+" "+p);
			}
		}
	}
	
	public void printSmallerSorted(int price) {
		
		SortedMap<Integer,List<String>> s=m.headMap(price);
		for(Map.Entry<Integer, List<String>> e:s.entrySet()) {
			int p=e.getKey();
			for(String k:e.getValue()) {
				System.out.println(k+" "+p);
			}
		}
	}

}
