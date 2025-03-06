package dev.lpa.domain;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MathematicalOperation {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	} */
	
	static BigInteger add(int n) {
		
		
		BigInteger C=new BigInteger("1");
		
		for(int i=2;i<=n;i++) {
			
			BigInteger x=BigInteger.valueOf(i);
			
			C = C.multiply(x);
		}
		
		return C;
    }
	
	static BigInteger fib(int n) {
		
		BigInteger a=BigInteger.valueOf(0);
		BigInteger b=BigInteger.valueOf(1);
		BigInteger c=BigInteger.valueOf(1);
		
		System.out.print(a+" "+b);
	
		for(int i=2;i<=n;i++) {
			
			
			c=a.add(b);
			a = b;
			b = c;
			
			System.out.print(" "+c);
			
		}
		
		return c;
	}
	
	
	public static int findMin(int a, int b) {
		
		
		int c = a + b;
		
        int d = a * b;
        
        int e = a - b;
        
        int f;
        try {
         f = a/b;
        
        
        }
        catch(ArithmeticException g){
            
            System.out.println("Error: Don't divide a number by zero");
            f=0;
            
            }
         
        
        int smallest=Math.min(c, d);
        int smallest1=Math.min(e, f);
        int leastsmall=Math.min(smallest,smallest1);
        return leastsmall;
        
        }
	
	public static int sumUsingStreams(int[] arr) {
		
		
		//Stream<int[]> stream;
		//Stream.of(arr).distinct();
		//Arrays.stream(arr).sum()
		int sum=Arrays.stream(arr).sum();
		return sum;
		
	}
	
	public static int countWords(String str) {
        
		String[] st=str.split(" ");
		
		return st.length;
    }
	
	public static ArrayList<Integer> getSmaller(ArrayList<Integer> arr, int k) {
	    // Your code here
		
		int n=arr.size();
		ArrayList<Integer> newArr=new ArrayList<Integer>();
		for(int i=0; i<n;i++) {
			
			int num=arr.get(i);
			if(num < k) {
				newArr.add(num);
			}
			
		}
		
		return newArr;
	}
	
	interface Add {
	    public int addParameters(int a, int b);
	}
	
	
	public static Add helperFunction(){
		
		Add ad=(a,b)->a+b;
		return ad;
	    // Your code here
	    // Implement the addParameters method that returns a+b.
				
	}
	
	interface Multiply {
	    public int multiplyBy5(int n);
	}
	
	public static Multiply helperFunction1() 
	{
	    //Your code here
	    //Implement the multiplyBy5(int n) method using lambda expression. The implemented function should return n*5
	    Multiply mult=(n)->n*5;
	    return mult;
	}
	
	
	interface Hello {
	    public void sayHello();
	}
	
	public static Hello helperFunction2() {
		
		Hello hello=()->System.out.println("Hello");
		return hello;
	}
	
	public static void main(String[] args) {
		
		
		//System.out.println(helperFunction().addParameters(1, 5));
		//System.out.println(helperFunction1().multiplyBy5(6));
		//helperFunction2().sayHello();
		/*String a = "Hello";
		String b = "World";
		System.out.println(a = b); */
		//int x=findMin(0,5);
		
		//System.out.println(x);
		//BigInteger C=fib(100);
		//System.out.println(C);
		
		//int[] arr= {3,2,1};
		//System.out.println(sumUsingStreams(arr));
		/*int end = 4;

        BigInteger answer = new BigInteger("1");
        for (BigInteger start = BigInteger.ONE;
             start.compareTo(new BigInteger("" + end)) <= 0;
             start = start.add(new BigInteger("1"))) {
            answer = answer.multiply(start);
        }
        System.out.println(answer); */
		  
		 /* ArrayList<Integer> arr=new ArrayList<Integer>();
		  arr.add(100);
		  arr.add(20);
		  arr.add(40);
		  arr.add(60);
		  arr.add(80);
		  arr.add(200);
          System.out.println(getSmaller(arr,50)); */
		
		//System.out.println(countWords("World is Hello"));
		
		/*int[] arr= {3,2,1};
		System.out.println(Arrays.stream(arr).max().getAsInt());*/
		
		
	}

}
