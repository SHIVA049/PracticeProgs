package dev.lpa.domain;

//lpackage dev.lpa.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Character[] a= {'a','b','c'};
         Character[] b= {'a','b','c','d'};
         int[] c= {1,2,3,4};
        int[] d= {1,2,4,3};
         Object[] ax= {1,2,3,4}; 
         
         Integer[] g = { 10, 20, null, 30 };
         Integer[] s = { 10, 20, 30, null };

         System.out.println(Arrays.equals(a, 0, 1, b, 0, 1));
         
         System.out.println(Arrays.compare(c, d));
         String[] st= {"ab","bc","ab"};
         
         Arrays.fill(ax, "kite");
         
         //Arrays.fill(c, 0, 3, 20);
         System.out.println(Arrays.toString(ax));
         //System.out.println(c);
         
         /* int x=Arrays.binarySearch(d,6);
          if(x>=0) {
        	  return x;
          }else {
        	  return -1;
          } */
         //System.out.println(x);
        // System.out.println(Arrays.mismatch(a, b));
        // System.out.println(Arrays.compare(a, b));
        // System.out.println(Arrays.compareUnsigned(c, d));
         
         ArrayList<Character> list=new ArrayList<>();
         ArrayList<String> StrList=new ArrayList<>();
        // System.out.println(Arrays.stream(st).anyMatch(p->p.startsWith("a")));
         if(Arrays.stream(st).anyMatch(p->p.startsWith("a"))==true) {
        	 for(String an:st) {
        		 StrList.add(an);
        	 }
         }
        // System.out.println(StrList);
         //System.out.print(Arrays.binarySearch(b,'d'));
         List<Character> ab= new ArrayList<>(Arrays.asList(a));
         //System.out.println(ab.size());
          if(ab.contains(c)) {
        	 ab.add('d');
         }else {
        	 ab.add('e');
         } 
        // System.out.println(ab);
         list.add('d');
        // System.out.println(list);
         for(char e:a) {
        	 list.add(e);
         } 
         //System.out.println(list);
         //System.out.println(ab);
         //System.out.println(Arrays.toString(a));
         
	}

}
