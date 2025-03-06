package dev.lpa.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GFGString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int len=countWords("Geeks");
		System.out.print(len); */
		/*String st=sliceString("World");
		System.out.print(st); */
		
		//changeCase("world");
		//alphabets('h','u');
		//System.out.print(isPanagram("HeavyDuty"));
		//System.out.print(extraChar("abc","abcd"));
		//System.out.print(areAnagrams("allergy","allergic"));	
		//System.out.println(canMakeAnagrams1("ac","c"));
		
		/*List<? extends Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        System.out.println(first); */
		
		/*ArrayList<String> al=new ArrayList<>();
		al.add("Geeks");
		al.add("For");
		al.add("Geeks");
		al.add("is");
		al.add("Fun");
		String x="";
		
		Iterator<String> it=al.iterator();
		
		while(it.hasNext()) {
			
			x = x+" "+it.next();
		}
		
		
		
		System.out.println(x); */
		
		/*Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt(); */
        
        
		/*int x = 10; 
        if (++x < 10 && (x / 0 > 10)) { 
            System.out.println("Ankit"); 
        } else { 
            System.out.println("GEEKS"); 
        }  */
		
		//System.out.println(equationSum(2));
        
        //System.out.println(a+(n-1)*d);
        
        //System.out.println(a*r(m);
			
		//System.out.println(closedLockers(-1,-1));
		//int[] arr= {3,2,1};
		//System.out.println(fillArrayList(arr));
		/*ArrayList<Integer> a=new ArrayList<>();
		add_to_ArrayList(a, 4);
		add_to_ArrayList(a, 6);
		add_to_ArrayList(a, 7);
		sort_ArrayList_Asc(a);
		reverse_ArrayList(a); */
		
		/*ArrayList <Integer> lst = new ArrayList<>();

        lst.add(1);

        lst.add(2);

      //Printing Statement 
        System.out.println(lst.toArray()[0]); */
		
		//iterateArrayList();
		/*ArrayList<Integer> list=new ArrayList<>();
		list.add(-12);
		list.add(8);
		list.add(-7);
		list.add(6);
		list.add(12);
		list.add(-9);
		list.add(14); */
		//System.out.println(posAverage());
		System.out.println(isSorted());

	}
	
	
    public static int[] colSum() {
		
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		int[] ret=new int[mat[0].length];
		for(int j=0;j<mat[0].length;j++) {
			int col_sum=0;
			for(int i=0;i<mat.length;i++) {
				
				col_sum = col_sum + mat[i][j];
				
			}
			
			ret[j] = col_sum;
		}
		
		
		return ret;
		
	}
	
	public static boolean isSorted() {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		boolean sorted=true;
		
		if (list.size() == 0 || list.size() == 1)
            return true;
		
		//Collections.sort(list);
		for(int i=1;i<list.size();i++) {
			
			if (list.get(i-1).compareTo(list.get(i)) > 0) 
				sorted = false;	
				
		}
		
		return sorted;
		
	}
	
	public static double posAverage() {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(8);
		list.add(-7);
		list.add(6);
		list.add(12);
		list.add(-9);
		list.add(14);
	    int siz=list.size();
	    int count=0;
	    double sum=0;
	    
	    for(int i=0;i<siz;i++) {
	    	
	    	if(list.get(i) >= 0) {
	    		
	    		sum = sum + list.get(i);
	    		count++;
	    	}
	    	
	    	
	    	
	    }
	    
	    double avg=sum/count;
    	return avg;
		
		
		
		
		
		
	}
	
	
	
	public static void iterateArrayList() {
	    // Your code here
	    // Just print the elements, don't provide new line
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		
		for(int i=0;i<size;i++) {
		 arr.add(sc.nextInt());
		
		}
		Iterator iterator=arr.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next()+" ");
			
		}
	}
	
	
	public static void add_to_ArrayList(ArrayList<Integer> A, int x)
	{
		
		A.add(x);
		System.out.println(A);
		//Your code here
		//Just add, don't print anything
	}	

	public static void sort_ArrayList_Asc(ArrayList<Integer> A)
	{
	     Collections.sort(A);
	     System.out.println(A);
		//Your code here
		//Just sort, don't print anything
	}

	public static void reverse_ArrayList(ArrayList<Integer> A)
	{
		Collections.reverse(A);
		System.out.println(A);
		//Your code here
		//Just reverse, don't print anything
	}

	public static int size_Of_ArrayList(ArrayList<Integer> A)
	{
		return A.size();
		//Your code here
		//Return the size of ArrayList
	}

	public static void sort_ArrayList_Desc(ArrayList<Integer> A)
	{
		Collections.sort(A,Collections.reverseOrder());
		//Your code here
		//Just sort in desc order, don't print anything
	}

	public static void print_ArrayList(ArrayList<Integer> A)
	{
		//Your code here
		//Print the elements of A, don't add new line
		for(int i=0; i<A.size();i++) {
			
			System.out.print(A.get(i)+" ");
		}
		
	}
	
	
	public static ArrayList<Integer> fillArrayList(int arr[]) {
	    // Your code here
		
		ArrayList<Integer> al=new ArrayList<>();
		//Arrays.asList(arr);
		
		for(int i=0; i<arr.length;i++) {
			
			al.add(arr[i]);
		}
		
		return al;
	}
	
	
	public static int equationSum(int n)
	{
	    //Your code here
	    
	    int S2=0;
	    
	    for(int i=1;i<=n;i++){
	        
	        int Ti=(int) (2*i+(Math.pow((i+1),2)) - ((Math.pow(i,2)+4)));
	        
	        S2= S2 + Ti;
	        
	    }
	    
	    return S2;
	}
	
	
	public static int closedLockers(int n,int m)
	{
	    //Your code here
		int count=0;
		
	    for(int i=1;i<=n;i++) {
	    
	    	if(n <= 1 && m <= 1) {
				count = 0;
				break;
			}
	    	
	    	
	    	if(i % m != 0) {
	    		
	    		count++;
	    	}
	    	
	    }
	    
	    return count;
	    
	}
	
	
	public static void lengthString(String str) {
		
		System.out.print(str.length());
		
	}
	
	public static int countWords(String str) {
		
		String[] splitstring = str.split(" ");	
		return splitstring.length;
	
	}
	
	public static String sliceString(String s) {
		
		int len=s.length();
		String st="";
		for(int i=1;i<len-1;i++) {		
			st=st+s.charAt(i);		
		}
		return st;	
	}
	
	public static void changeCase(String s) {
		
	     String sbstr=s.substring(0, 1);
	    String upperCase=sbstr.toUpperCase()+s.substring(1);
	    System.out.println(upperCase);
	    System.out.println(s.toUpperCase());
	    
	}
	
	public static void alphabets(char c1, char c2) {
			
		for(c1=c1;c1<=c2;c1++) {			
			System.out.print(c1 + " ");		
		}			
	}
	
	public static boolean isPanagram(String s) {
		
		
	    int len=s.length();
	    boolean visited[] = new boolean[26];
	    if(len < 26) {
		return false;
	    }
	    for(int i=0;i<len;i++) {
	    	char x=s.charAt(i);
	       if(x>='a' && x <= 'z') {
	    	   visited[x-'a']=true;
	       }
	       if(x>='A' && x <= 'Z') {
	    	   visited[x-'A']=true;
	       } 	
	    }
	    for(int i=0;i<26;i++) {
	    	if(visited[i] == false) {
	    		return false;
	    	}
	    	
	    }
	    
	    return true;
		
		
	}
	
	public static char extraChar(String s1, String s2) {
		
		//s1="abcd"; s2="badce";	
		//s1="abc"; s2="abcd";
		//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
		//a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
		
		int res=0;
		int len= s1.length();
		
		for(int i=0;i<len;i++) {
			
			int res1=s2.charAt(i) - s1.charAt(i);
			
			res = res + res1;
			
		}
		
		return (char)(res+s2.charAt(len));
		
	}
	
	public static boolean areAnagrams(String s1,String s2) {
	
	int res=0; int l1=s1.length(); int l2=s2.length();
	int len=0;
	boolean s3x = false;
	//s1=bc s2=ad
	//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
	//a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
			
	if(l2 != l1) {
		return false;
	}
	for(int i=0;i<l1;i++) {
	   res = res + (s1.charAt(i) - s2.charAt(i));
	} 
	for(int i=0;i<s1.length();i++) {
		char s1x = s1.charAt(i);		
		char s2x;		
		for(int j=0;j<l1;j++) {
			s2x=s2.charAt(j);
			if(s1x==s2x) {
				s3x=true;
				continue;
			}
			
		}	
		
	}
	
	if(res == 0 && s3x==true) {
		return true;
	}
	return false;
	}
	
	//static final int CHAR=256;
	public static boolean isAnagram(String s1,String s2) {
		
		int res=0; int len1=s1.length(); int len2=s2.length();
		int[] count=new int[256];
		
		if(len1 != len2) {
			return false;
		}
		for(int i=0;i<len1;i++) {
			
		count[s1.charAt(i)]++;
		count[s2.charAt(i)]--;
			
		}
		for(int i=0; i<256;i++) {
			if(count[i] != 0)
				return false;
			
		}
		return true;		
	}
	
	public static boolean isPalindrome(String s) {
		
		int len=s.length();
		String s1="";
		for(int i=len-1;i>=0;i--) {
			s1 = s1 + s.charAt(i);
			
		}
		if(s.equalsIgnoreCase(s1)) {
			return true;
		}
		
		return false;
	}
	
	public static String reverseString(String s) {
		int len=s.length();
		String s1="";
		for(int i=len-1;i>=0;i--) {
			s1 = s1 + s.charAt(i);	
		}
		
		return s1;
	}
	
	public static String toBinary(int n) {
		
		String binaryvalue="";
		if(n>0) {	
			binaryvalue=Integer.toBinaryString(n);	
		}
		return binaryvalue;					   
	}
	
	public static int binary_to_decimal(String b) {
		   
		return Integer.parseInt(b, 2);	
    }
	
	public static int findPattern(String s, String p){
	    
		if(s.contains(p)) {
			int index=s.indexOf(p);
			return index;
		}
		else {
			return -1;
		}    
	}
	
	public static String canMakeAnagrams(String s1, String s2){
        
		//s1="abcd" s2="ac"
	    //write your code here
		int res=0; int len1=s1.length(); int len2=s2.length();
		int len=0;
		int[] count=new int[256];
		int i;
		try {
		if(len1 > len2) {
			len = len1;
		}else {
			len = len2;
		}
		
		for(i=0;i<len;i++) {
			
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		if(count[i] != 0) {
			System.out.print(i);
		}
		
		}
		catch(IndexOutOfBoundsException e){
			
			System.out.println("Index Out of Error: Please correct It, Before proceeding");
			
		}
		finally {
		   return s2;
		}    
	}
	
	public static int coutChars(String s1, String s2) {
		
		//s1="madame"; s2="madam";
		int len1=s1.length(); int len2=s2.length();
		System.out.println(len1);
		System.out.println(len2);
		if(len1 > len2) {
			return (len1 - len2);
		}else {
			
			return (len2 - len1);
		}
			
	}
	
	public static String canMakeAnagrams1(String s1, String s2) {
		
		//s1="abcd" s2=ac
		int len1=s1.length(); int len2=s2.length();
		int len=0;
		char s1x;
		char s2x;
		String s3x="";
		
		if(len1 < len2 && len1>1) {
			len = len1;
		}else {
			len=len2;
		}
		
	    for(int i=0;i<len1;i++) {
	    	s1x=s1.charAt(i);
	       for(int j=0;j<len2;j++) {
	    	   s2x=s2.charAt(j);
	    	  if(s1x==s2x) {
	    		 s3x=s3x+"True"+" ";
	    		 continue;
	    		 
	    		 
	    	  }
	    	  else {
	    		  
	    		  s3x=s3x+"False"+" ";
	    		  
	    	  } 
	       }
	    }	    
	    String[] strsplt=s3x.split(" ");
	    int count=0;
	    
	    for(String s:strsplt) {
	    	if(s.contains("True")) {
	    		count++;
	    	}
	    }
	    if(count==len) {
	    	return "True";
	    }
	    return "False";
	        	
	    
	}
			
	

}