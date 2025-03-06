package dev.lpa.domain;

import java.util.*;

public class Nsstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Stack<Integer> stmain=new Stack<>();
		int[] arr= {1,6,43,1,2,0,5};
		stmain=_push(arr);
		_pop(stmain); */
		//nextGreaterElement1();
		//stockSpanStack();
		//previousGreater();
		//stackPreviousGreater();
		//getMinFromStack();
		//stackNextGreaterElement();
		/*Queue<Integer> q= new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		reverseQueue(q,3); */
		//generateNumbers(4);
		//Queue<Integer> a=new ArrayDeque<>();
		
	    /*a.add(1);
	    a.add(3);
	    a.add(2);
	    a.add(9);
	    a.add(10); */
	    //queueTraversal(a);
	    //System.out.print(rev(a));
		//insert(a,3);
		//System.out.println(findFrequency(a,3));
		//System.out.print(generate(5));
		//maxInSubArray();
		//int[] arr= {1};
		//System.out.print(deque_Init(arr,4));
		/*ArrayDeque<Integer> deq=new ArrayDeque<>();
		deq.add(74);
		deq.add(7);
		deq.add(5);
		deq.add(48);
		deq.add(97);
		deq.add(64);
		deq.add(25);
		deq.add(37);
		deq.add(87);
		deq.add(63);
		printDeque(deq); */
		//int arr[]= {74,7,5,48,97,64,25,37,87,63};
		//printMax(arr,3);
		ArrayDeque<Integer> deq=new ArrayDeque<>();
		deq.add(1);
		deq.add(2);
		deq.add(3);
		deq.add(4);
		deq.add(5);
		deq.add(6);
		left_Rotate_Deq_ByK(deq,2);

	}
	
	
	
	public static Stack<Integer> _push(int arr[]) {
		
		Stack<Integer> ns=new Stack<>();	
		
		for(int i=0;i<arr.length;i++) {				
			ns.push(arr[i]);			
		}
		System.out.println(ns.contains(6));
		return ns;
	    
	}

	public static void _pop(Stack<Integer> s) {
	    // Your code here
		
		int size=s.size();
		for(int i=0;i<size;i++) {
			//s.contains(s)
		System.out.print(s.pop()+" ");
		}
	}
	
	
	public static void nextGreaterElement() {
		
		//int[] arr= {1,2,4,8,6,10};
		int[] arr= {5,15,10,8,6,12,7};
		for(int i=0; i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				if(i==arr.length-1) {
					System.out.print(arr[i]+" ");
					System.out.print(-1 +"\n");
					break;
				}
				if(arr[j] > arr[i]) {
					System.out.print(arr[i]+" ");
					System.out.print(arr[j]+"\n");
					break;
				}
				
			}
			
		}
		
	}
	
	public static void stockSpan() {
		
		int[] arr= {60,10,20,40,35,30,50,70,65};
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			int count = 1;
			for(int j=i-1;j>=0 && arr[j]<=arr[i];j--) {			    
				   count++;   
			   }			   
			   System.out.print(count+" ");
			}

		}
		
	public static void stockSpanStack() {
		
		int arr[]= {60,10,20,40,35,30,50,70,65};
		int len=arr.length;
		int span=1;
		Deque<Integer> stack=new ArrayDeque<>();
		stack.push(0);
		System.out.print(span+" ");
		
		for(int i=1;i<len;i++) {
		    while(stack.isEmpty()==false && arr[stack.peek()]<=arr[i]) {
			stack.pop();	
		}
		span=(stack.isEmpty()) ? (i+1):(i-stack.peek());
		stack.push(i);
	}

}
	
	public static void previousGreater() {
		
		//int[] arr= {5,10,20,30,40};
		int[] arr={15,10,18,12,4,6,2,8};
		//o/p : -1,15,-1,18,12,12,6,12
		for(int i=0;i<arr.length;i++) {
			int pg=-1;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>arr[i]) {
					pg=arr[j];
					break;
				}		
		}
		System.out.print(pg+" ");		
	}
}
	
	public static void stackPreviousGreater() {
		int[] arr= {15,10,18,12,4,6,2,8};
		ArrayDeque<Integer> stack=new ArrayDeque<>();
		stack.push(arr[0]);
		int pg=-1;
		System.out.print(pg+" ");
		for(int i=1;i<arr.length;i++) {
			while(stack.isEmpty()==false && stack.peek()<=arr[i]) 
			    stack.pop();
		    pg=stack.isEmpty()?-1:stack.peek();
		    System.out.print(pg+" ");
		    stack.push(arr[i]);
		
	}
}
	
	public static void nextGreaterElement1() {
		int[] arr= {5,15,10,8,6,12,7};
		//int[] arr= {10,15,20,25};
		//int[] arr= {25,20,15,10};
		for(int i=0;i<arr.length;i++) {
			int pg=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					pg=arr[j];
					break;
				}			
			}			
			System.out.print(pg+" ");
		}
	}
	
	public static void stackNextGreaterElement() {
		int[] arr= {5,15,10,8,6,12,7};
		int len=arr.length;
		ArrayDeque<Integer> stack=new ArrayDeque<>();
		stack.push(arr[len-1]);
		int[] res=new int[len];
		res[len-1] = -1;
		for(int i=len-2;i>=0;i--) {
			while(stack.isEmpty()==false && stack.peek()<=arr[i]) {
				stack.pop();
				res[i]=stack.isEmpty()?-1:stack.peek();
				stack.push(arr[i]);
			}
			
			}
		for(int i=0;i<len;i++) {
			System.out.print(res[i]+" ");
		}
		
		}
	
	public static void getMinFromStack() {
		
		ArrayDeque<Integer> ms=new ArrayDeque<>();
		ArrayDeque<Integer> as=new ArrayDeque<>();
		
		//Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
				//int n=sc.nextInt();
		   if(ms.isEmpty()==true) {
			   ms.push(arr[i]);
			   as.push(arr[i]);
		   }
		   
		   ms.push(arr[i]);
		   if(as.peek()>=ms.peek()) {
			   as.push(arr[i]);
		   }
		   
		   
		   
		}
		
		if(ms.peek()==as.peek()) {
			   as.pop();
			   ms.pop();
			   
		   }
		
		System.out.println(ms);
		System.out.println(as);
		
		System.out.println("Minimum Element from the stack is "+ as.peek());
		
	}
	
	public static void reverseQueue(Queue<Integer> q, int k) {
		
		Stack<Integer> sk=new Stack<>();
		for(int i=0;i<k;i++) {
			sk.push(q.poll());
		}
		
		while(sk.isEmpty()==false) {
			q.offer(sk.pop());
		}
		
		for(int i=0;i<q.size()-k;i++) {
			q.offer(q.poll());
		}
		
		System.out.print(q);
			
			
		}
		
	public static void generateNumbers(int n) {
		
		Queue<String> q=new LinkedList<String>();
		q.add("5");
		q.add("6");
		for(int count=0;count<n;count++) {
			String curr=q.poll();
			System.out.print(curr+" ");
			q.add(curr+"5");
			q.add(curr+"6");		
			
		}
		
	}
	
	public static void insert(Queue<Integer> q,int k) {
		
		//Queue<Integer> q=new ArrayDeque<>();
		int[] insert= {1,2,3,4,5,2,3,1};
		for(int i=0;i<insert.length;i++) {
			q.offer(insert[i]);
		}
		
		System.out.print(q);
	}
	
	public static int findFrequency(Queue<Integer> a,int k) {
		
		
		Queue<Integer> q=new ArrayDeque<>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.offer(1);
		
		while(a.isEmpty()==false) {
			
			int s=a.poll();
			int count=0;
			for(int i=0;i<q.size();i++) {
				//int count=0;
			     q.contains(s);
			     count++;	
			    
			}
			
			 return count;
			
		}
		
		return -1;
	}
	
	public static void queueTraversal(Queue<Integer> q) {
	    // Your code here
	    
	    while(q.isEmpty()==false) {
	        
	        System.out.print(q.poll()+" ");
	    }
	}
	
	public static Queue<Integer> rev(Queue<Integer> q) {
        
		Stack<Integer> s=new Stack<>();
		while(q.isEmpty()==false) {
			s.push(q.poll());			
		}
		while(s.isEmpty()==false) {
			q.offer(s.pop());
		}
		
		return q;
    }
	
	static ArrayList<String> generate(int n) {
        
		Queue<String> q=new LinkedList<String>();
		ArrayList<String> al=new ArrayList<>();
		q.add("1");
		//q.add("0");
		for(int count=0;count<n;count++) {
			String curr=q.poll();
			al.add(curr);
			q.add(curr+"0");
			q.add(curr+"1");		
			
		}
		
		return al;
    }
	
	public static void maxInSubArray() {
		
		
		int[] arr= {1,2,3,1,4,5,2,3,6};
		int K=3;
		
		for(int i=0;i<arr.length-2;i++) {
			int max=arr[i];
			for(int j=i+1;j<i+K;j++) {
				max = Math.max(max, arr[j]);
				  
			}
	       System.out.print(max+" ");
		}
		
		
	}
	
	public static ArrayDeque<Integer> deque_Init(int arr[], int n){
		
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		
		for(int i=0;i<arr.length;i++) {
			//n=arr[i];
			dq.offerLast(arr[i]);
		}
		
		return dq;
	}
	
	public static void printDeque(ArrayDeque<Integer> deq) {
		
		/*Iterator dqIT=deq.iterator();
		while(dqIT.hasNext()) {
			System.out.print(dqIT.next()+" ");
		} */
		
		/*while(deq.isEmpty()==false) {
			
			System.out.print(deq.pollFirst()+" ");
		} */
		
		//Object[] arr=deq.toArray();
		/*for(int i=0;i<arr.length;i++) {
			if(i==x) {
				deq.remove(arr[x]);
				break;
			}
		}
		
		System.out.print(deq+" "); */
		/*for(int i=start;i<end;i++) {
			if(start==end) {
				return;
			}else {
			deq.remove(arr[i]);
			}
		}*/
		/*for(int i=0;i<=arr.length-1;i++) {
			deq.remove(arr[i]);
		}
		System.out.print(deq+" "); */
		while(deq.isEmpty()==false) {
			deq.remove();
		}
	}
	
	public static void printMax(int arr[], int k) {
		Deque<Integer> dq=new ArrayDeque<Integer>();
		for(int i=0;i<k;i++) {
			while(!dq.isEmpty() && arr[i] >= dq.peekLast()) {
				dq.removeLast();	
			}
			dq.addLast(i);
			
		}
		
		for(int i=k;i<arr.length;i++) {
			System.out.println(arr[dq.peek()]+" ");
		  while(!dq.isEmpty() && dq.peek() <= i-k)
			  dq.removeFirst();
		  while(!dq.isEmpty() && arr[i] >= dq.peekLast()) {
				dq.removeLast();
				
			}
		  dq.addLast(i);
		}
		System.out.print(arr[dq.peek()]+" ");
		
	}
	
	public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
	    // Your code here
		//int count=0;
		/*while(deque.isEmpty()==false && count<k) {
			deque.offerLast(deque.pollFirst());
			count++;
		}
		
		System.out.print(deque); */
		while(k>0) {
			int Front=deque.peek();
			deque.add(Front);
			deque.pollFirst();
			k--;
		    
		}
		
		System.out.print(deque);
	}
	
}
