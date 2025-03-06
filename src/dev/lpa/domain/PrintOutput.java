package dev.lpa.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintOutput {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char ch='a';
		int x=10; int y=20;
		//System.out.println("Path:C: \\xyz\\ abc.txt");
		System.out.println(ch+1);
		int z=++x;
		System.out.println(z+" "+x); */
		
		//geometricProgOfNumber();
		//evenODD();
		//leapYear();
		//calculator();
		//countDigits();
		//tableOfNumber();
		//pattern();
		//patternTriangle();
		//pyrmidPattern();
		//factorialOfANumber();
		//gcdOfANumber();
		//lcmOfANumber();
		//divisorsOfANumber();
		//nextPrimeNumber();
		//fibonacciSeries();
		//firstDigitOfANumber(5762);
		//primeFactorization(13);
		//boolean s=sortArrayCheck();
		//System.out.print(s);
		//distinctElementsOfArray();
		//int[] a=arrayTraversal();
		
		//int b=largest();
		//int sum=sumOfArrayElements();
		//double average=posAverage();
		//System.out.print(average);
		/*int[] ret=rowSum();
		System.out.println(ret); */
		//snakePattern();
		//minRow();
		//string();
		
		//System.out.println(colSum());
		//System.out.println(maximumElement());
		
		/*int[] arr= {324,5,2,2};
		System.out.println(getSmaller(arr,3)); */
		//System.out.println(minimumVerticalSum());
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(5);
		arr.add(5);
		//arr.add(2);
		//arr.add(3);
		//arr.add(4);
		//arr.add(5);
		//arr.add(9);
		
		System.out.println(maxNeighbour(arr));
		
		//System.out.println(evenOdd(list));
        	

	}
	
	
	public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
		
		ArrayList<Integer> arr1=new ArrayList<>();
		
		for(int i=0;i<arr.size()-1;i++) {
			
			
			
			if(arr.get(i) > arr.get(i+1)) {
				
				arr1.add(arr.get(i));
			}else {
				
				arr1.add(arr.get(i+1));
			} 
			
		} 
		
		
		
		return arr1;
	    // Your code here
	}
	
	//public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> list){
	public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> list) {
		
		//ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
	    //ArrayList<Integer> inner = new ArrayList<Integer>();      
		ArrayList<ArrayList<Integer>> even=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> even1=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i) % 2 == 0) {
				
				even1.add(list.get(i));
				
			}else {
				
				odd.add(list.get(i));
				//even.add(1,odd);
				//even.add(even1);
			}
			
		}
		
		even.add(even1);
		even.add(1,odd);
		//even.addAll(even1);
		
		//even.add(1,odd);
		//return even.add(0, even1);
		//System.out.pri
		
		return even;
		//return ArrayList<even>;
		
	}
	
	public static ArrayList<Integer> getSmaller(int arr[], int target) {
		

	    // write your code here
	    // return an arraylist with elements smaller than target
	    // maintain the order while traversing
		ArrayList<Integer> smallerElements=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] < target) {
				
				smallerElements.add(arr[i]);
			}
			
		}
		
		
		return smallerElements;
	}
	
	public static int maximumElement() {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(1);
		
		return Collections.max(list);
		//return 0;
		
		
	}
	
	
	
	public static void sumOfNnumbers() {
		
		
		System.out.print("Enter the number ");
		int x=sc.nextInt();
			   
		int sum=0;
		
		for(int i=1;i<=x;i++) {
			
			sum=sum+i;
		}
		
		System.out.println(sum);
		
	}
	
	public static void lastDigitOfNumber() {
		
		//System.out.print("Enter the Number ");
		int x=sc.nextInt();
		
		int y=Math.abs(x);
		
		int z= y % 10;
		
		System.out.println("Last Digit of a Given Number is "+z);
		
		
		
	}
	
	public static void arithmeticProgression() {
		
		int a=5;int d=2; int N=10;
		
		int z=a+(N-1)*d;
		
		System.out.print("Nth Term of AP is "+z);
	}
	
	public static void daysLogicOfWeek() {
		
		int d=3; int n=9;
		
		int x = n % 7;
		
		int dayOfAweek= d - x ;
		
		if(dayOfAweek> 0) {
		   System.out.println(dayOfAweek);
		}
		else {
			int y = dayOfAweek + 7;
			System.out.println(y);
		}
		
		
	}
	
	
	public static void geometricProgOfNumber() {
		
		int a=2;int r=2; int N=4;
		
		int GP=a* (int)Math.pow(r, N-1);
		
		System.out.println(GP);
		
	}
	
	public static void evenODD() {
		
		System.out.println("Please Enter a Number ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println(num + " is a Even Number");
		}
		else {
			System.out.println(num + " is a ODD Number");
		}
	}
	
	public static void greatestOfThree() {
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x > y && x > z) {
		   
			System.out.println(x);
		}
		else if(y > x && y > z) {
			System.out.println(y);
		}else {
			System.out.println(z);
			
		}
	}
	
	public static void leapYear() {
		
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			
				System.out.println("Leap Year");
			
		}else if(year % 400 == 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Non Leap Year");
		}
	}
	
	public static void  calculator() {
		
		System.out.println("SELECT THE OPERATION: "
		          + "\n 1 : Addition "
		          + "\n 2 : Substraction "
		          + "\n 3 : Multiplication ");
		          
Scanner sc= new Scanner(System.in);

int operator = sc.nextInt();

if(operator != 1 && operator != 2 && operator != 3 ){
  
  System.out.println("Invalid Input");
}
else {
  
  if(operator == 1){
      System.out.println("Enter the value of a: ");
      int a = sc.nextInt();
      System.out.println("Enter the value of b: ");
      int b = sc.nextInt();
      int ans = a + b;
      System.out.println(ans);
      
  }
  else if(operator == 2){
  System.out.println("Enter the value of a: ");
      int a = sc.nextInt();
      System.out.println("Enter the value of b: ");
      int b = sc.nextInt();
      int ans = a - b;
      System.out.println(ans);
} else if(operator == 3){
  System.out.println("Enter the value of a: ");
      int a = sc.nextInt();
      System.out.println("Enter the value of b: ");
      int b = sc.nextInt();
      int ans = a * b;
      System.out.println(ans);
}
}
}
	
	public static void countDigits() {
		
		System.out.println("Please Enter the Number of Your Choice: ");
		Scanner sc = new Scanner(System.in);
		int count=0;
		int s=sc.nextInt();
		
		  while(s > 0) {
			  s = s/ 10;
			  count++;
		  }
		
		System.out.print("Total count of Digits in a Number is "+count);
	
	}
	
	public static void tableOfNumber() {
		System.out.println("Please Enter the Number of Your Choice: ");
		int s=sc.nextInt();
		for(int i=1; i <= 10; i++) {
			
			int result = s * i;
			System.out.print(result+" ");
		}
		
	}
	
	public static void pattern() {
		
		System.out.println("Enter a Number Of your Choice ");
		int s = sc.nextInt();
		
		for(int i=0; i<s ; i++) {
			for (int j=0; j<s; j++) {
				
				System.out.print("*"+" ");
			}
			
		   System.out.println();
		   //s++;
		   
		}
	}
	
	public static void patternTriangle() {
		
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			int j;
			for(j=0;j<n-i;j++) {
				//System.out.print(" ");
				System.out.print(" ");
				
			}
			while(j<=n) {
				System.out.print("*"+" ");
				j++;
			}
			System.out.print("\n");
			
			
		}
	}
	
	public static void pyrmidPattern() {
		
	System.out.print("Enter a Number of your Choice ");
	int n= sc.nextInt();
	for(int i=1; i<=n; i++) {
		int j;
	   for(j=1;j<n-i;j++) {
		   
		   System.out.print(" ");
	   }
	   
	   int K=1;
	   while(K<=2*i-1)
	   {
		   System.out.print("*");
		   K++;
	   }
	   
	   System.out.println();
		
	}
	
		
	}
	
	public static void factorialOfANumber() {
		
		System.out.print("Enter a Number of Your Choice ");
		//int factor=0;
		int n = sc.nextInt();
		int i=1;
		while(n>0) {
			i = n * i;
			n--;
		} 
		
		
		
		System.out.print(i);
	}
	
	public static void gcdOfANumber() {
		 
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter two numbers of your choice ");
	     int n= sc.nextInt();
	     int m= sc.nextInt();
	     
	     int k = Math.min(n,m);
	     int ans =1 ;
	     for(int i=1; i<=k; i++) {
	    	 
	    	  
	    	 if(n % i ==0 && m % i ==0) {
	    		 
	    		 ans=i;
	    	 }
	     }
	     
	     System.out.print("GCD Of a Number is= "+ans);
	}
	
	public static void lcmOfANumber() {
		
		 //System.out.print("Enter two numbers of your choice ");
	     int n= sc.nextInt();
	     int m= sc.nextInt();
	     int ans=1;
	     int k = Math.max(n,m);
	     for(int i=1; i<=k; i++) {
	    	 
	    	 ans = k * i;
	      if(ans % n ==0 && ans % m == 0) {
	    	  
	    	  System.out.print(ans);
	    	  break;
	      }
	    	 
	     }
		
	}
	
	public static void divisorsOfANumber() {
		
		System.out.print("Enter two numbers of your choice ");
	    int n= sc.nextInt();
	    //ArrayList a=new ArrayList();
	    int x;
         //String a=" ";
	    for(int i=1; i<=n; i++) {
	    	
	     
	      
	      x = n % i;
	     if( x== 0){
	    	
	    	  //a.add(i);
	    	 System.out.print(i+" ");
	    	 
	       }
	    }
	    
	    //System.out.println(a);
	   
	   
	}
	
	public static void primeNumber() {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		
		for(int i=1; i<=n; i++) {
			
			if(n % i == 0) {
				count++;
			}
			
		}
		
		if(count==2) {
		    System.out.print("True");
		}
		else {
			System.out.print("False");
		}
	}
	
	
	public static void nextPrimeNumber() {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		
		int n1=n+1;
		
		while(n1 < 500) {
		for(int i=1; i<=n1;i++) {
			
			if(n1 % i == 0) {
				
				count++;
			}
		
		
			
		}
		
		if(count==2) {
		    System.out.print(n1);
		    break;
		}
		count=0;
		n1++;
		}	
		
	}
	
	public static void fibonacciSeries() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3=0;
		int sum=0;
		int i=1;
		String s="";
		String s1="";
		
		s=n1 + "" + n2;
		
		//System.out.print(s);
		
		while(i <= n) {
			
			
			n3 = n1 + n2 ;
			
			if(i==n3) {
				
				s1=s1+""+i;
				
				//s3 = s1 +
				//System.out.print(s1);
				n1=n2;
				n2=n3;
				
			}
			
			i++;
			
			
		}
		
		
		String s2=s + s1;
		System.out.println(s2);
		
		System.out.println(s2.charAt(n));	
		
	}
	
	public static void firstDigitOfANumber(int n) {
		
		
		while(n > 9) {
			
			n = n/10;
		}
		
		System.out.println(n);
		
		
		
	}
	
	public static void primeFactorization(int n) {
			
		for(int i=2; i<n; i++) {
			
			while(n % i == 0) {				
				n = n/i;				
				System.out.print(i+" " );				
			}
								
		}
		
		if(n > 1)
		
		System.out.print(n);
		
	}
	
	public static boolean sortArrayCheck() {
		
		int[] a = {90,80,100,70,40,30};
		
		
		
		for(int i=1; i<a.length;i++) {
			
			if(a[i] < a[i-1]) {
				
			   return false;
				
			}
			
			
			
			}
		return true;
		
		//System.out.print(true);
			
		} 
		
	
	public static void distinctElementsOfArray() {
		
		boolean isDistinct=true;
		int[] a= {10,20,10,30,20};
		
		//int i;
		for(int i=0; i<a.length;i++) {
			
			for(int j=(i-1);j>=0;j--) {
				
				if(a[i] == a[j]) {
				    isDistinct=false;
				    break;
				}
			}
			if(isDistinct==true) {
			System.out.print(a[i]);
			}
			isDistinct=true;
		}
		
		
	}
	
	public static int[] arrayTraversal() {
	    // Write your code below

	    // Don't provide the new line
		
		int arr[]= {10,20,10,30,40};
	    /*for(int i=0;i<arr.length;i++){
	        
	        System.out.print(arr[i]+" ");
	    } */
		
		//Scanner sc= new Scanner(System.in);
		
		//int input= sc.nextInt(); */
		
		
		
		
		
		//ArrayList a=new ArrayList();
		
		for(int i=0; i<arr.length;i++) {
			
			 arr[i]--;	
			
		}
		
		return arr;

	}
	
	public static int largest() {
		
		int[] arr= {10};
		
		int a=0;
		int b=0;
		int i=0;
		int largest=0;
		
		if(arr.length == 1) {
			return arr[i];
		}
		
		for(i=0; i<arr.length-1;i++) {
			
			a =arr[i];
		    b =arr[i+1];
		    
		    if(a >= b) {
		    	
		       if(a > largest)
		    	
		    	
		    	largest = a;
		    			
		    }
		    else if(b > largest) {
		    	
		    	largest = b;
		    }
		    
			
		}
		
		return largest;
	}
	
	public static int sumOfArrayElements() {
		
		int[] args= {10};
		
		int sum=0;
		
		for(int i=0; i<args.length;i++) {
			
			sum=sum+args[i];
		}
		
		return sum;
	}
	
	public static double posAverage() {
		
		int[] arr= {92,2,74,55,0,10,-60,24,91,-67,11};
		//11
		//92 2 74 55 0 10 -60 24 91 -67 11
		
		double average = 0;
		int count=0;
		double sum=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] >= 0) {
				sum= sum + arr[i];
				count++;	
			}
			
		}
		
		average = sum / count ;
		return  average;
	}
	
	public static int[] rowSum() {
		
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		int[] ret=new int[mat.length];
		
		for(int i=0; i<mat.length;i++) {
			int sum= 0;
			for(int j=0;j<mat[i].length;j++) {
				
				sum = sum + mat[i][j];
				
				//System.out.print(sum);
				//break;
				
			}
			
			ret[i] = sum;
			
		}
		
		return ret;	
			
	}
	
	//public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) 
	public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {
		
		// Your code here
		int[][] arr1=(int[][]) arr.toArray();
		int[][] arr2= {{2,3,5},{1,2},{1,4,5,1}};
		ArrayList<Integer> list=new ArrayList<>();
		//List<int[]> list=Arrays.asList(arr2);
		
		for(int j=0;j<arr2[0].length;j++) {
			int sum=0;
			for(int i=0;j<arr2.length;i++) {
				
				sum=sum + arr2[i][j];
				//list.add(i,sum);
			}
			
			list.add(sum);
		}
		
		System.out.println(list);
		return Collections.min(list);
		//return 0;
	    
	    
	    
	}
	
	public static int colSum() {
		
		ArrayList<Integer> sizefind=new ArrayList<>();
		ArrayList<ArrayList<Integer> > x= new ArrayList<ArrayList<Integer> >();
		x.add(new ArrayList<Integer>(Arrays.asList(1, 2,3,4)));
		x.add(new ArrayList<Integer>(Arrays.asList(3, 3)));
		x.add(new ArrayList<Integer>(Arrays.asList(1, 2,5,9)));
		
		//System.out.println(x.size());
		for(int i=0;i<x.size();i++) {
		//System.out.println(x.get(i).size());
			
			int a=x.get(i).size();
			//System.out.println(a);
			sizefind.add(a);
		    
		//System.out.println(Collections.max(x.get(i).size());
		}
		
		int maxsize=Collections.max(sizefind);
		for(int i=0;i<x.size();i++) {
		     while(x.get(i).size()<maxsize) {
			    
		    	 x.get(i).add(0);			
		}
		}
		
		int[][] intArray=x.stream().map(u->u.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
		
		
		
		//int[][] mat={{2,3,5},{1,2},{1,4,5,1}};
		ArrayList<Integer> list=new ArrayList<>();
		//int[] ret=new int[intArray[0].length];
		try {
		for(int j=0;j<intArray[0].length;j++) {
			int col_sum=0;
			for(int i=0;i<intArray.length;i++) {
				
				col_sum = col_sum + intArray[i][j];
				
			}
			
			list.add(col_sum);
			
			
		}
		}
		catch(IndexOutOfBoundsException e) {
			
			System.out.println("Array Out of Bound");
		}
		
		System.out.println(list);
		//return Collections.min(list);
		return Collections.min(list);
	
		
	}
	
	public static ArrayList<Integer> snakePattern() {
		
		int[][] matrix= {{10,20,30,40},{50,60,70,80},{27,29,47,48},{32,33,39,50}};
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<matrix.length;i++) {
			if(i % 2 == 0) {
			for(int j=0;j<matrix.length;j++) {
				
				ans.add(matrix[i][j]);
			}
			}
			else {
					for(int j=matrix.length-1;j>=0;j--) {
						
						ans.add(matrix[i][j]);
						
					}
					
				}
			}
		
		return ans;
	
		}
	
	
	public static int minRow() {
		
		int count=0;
		int row=0;
		
		int[][] mat= {{1,1,1,1},{1,1,0,0},{0,0,1,1},{1,1,1,1}};
		int n= mat.length;
		int i;
		
		for(i=0;i<mat.length;i++) {
			 count=0;
			for(int j=0;j<mat.length;j++) {
				
				if(mat[i][j] == 1) {
					
					count++;
				}
			}
			
			if(count < n) {
				
				
				
				n=count;
				row=i;
				
				//System.out.print(count);
				
			}
			
			//System.out.print(i);
		}
		
		return row;
		
	}
	
	public static void string() {
		StringBuffer str = new StringBuffer("Hello");

        StringBuffer first = str;

        first = first.reverse().append(str.reverse());

        System.out.println(str);
	}
	}


		
		
	//}

//}
