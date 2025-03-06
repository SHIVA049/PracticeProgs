package dev.lpa.domain;

import java.util.*;

public class PrtQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//purchaseMaxItem();
		//KLargestItemsInArray(5);
		
		/*ArrayList<Integer> arr= new ArrayList<>();
		arr.add(5);
		arr.add(5);
		arr.add(2);
		arr.add(99);
		arr.add(5);
		arr.add(3); 
		
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		for(int i=0;i<arr.size();i++) {
			pq1.add(arr.get(i));
		}
		System.out.print(insertion(arr));
		System.out.print(delete(pq1));
		System.out.print(insertion(arr)); */
		/*PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq1.add(5);
		pq1.add(10);
		pq1.add(50);
		pq1.add(25);
		System.out.print(delete(pq1));*/
		//pq1=insertion(arr);
		//System.out.println(pq1); 
		//int arr[] =  {100,200,500,600,300};
		//System.out.print(minCost(arr));
		//System.out.print(kthSmallest(arr,5));
        /*int k = 15;
        System.out.println(max_toys(arr,k)); */
        //printKMostFreq(arr, k); */
		 LinkedHashSet<Integer> H = new LinkedHashSet<Integer>();

	        H.add(1);
	        H.add(4);

	        System.out.println(H);
        
		
	}
	
	public static void purchaseMaxItem() {
		
		int[] costs= {1,12,5,111,200};
		int sum=10;
		int costsSum=0;
		int count=0;
		
		for(int i=0;i<costs.length-1;i++) {
			if(costs[i]<sum && costsSum<sum) {
				costsSum=costsSum+costs[i];
				count++;
			}
			
		}
		System.out.print(count);
		
	}
	
	public static int purchaseMaxPrQue(List<Integer> al, int sum) {
		
		return sum;
	}
	
	public static void KLargestItemsInArray(int k) {
		
		int[] arr= {8,6,4,10,9};
		Arrays.sort(arr);
		//System.out.println(arr);
		for(int i=0;i<=arr.length-1;i++) {
			if(i>=arr.length-k) {
			System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void printKLargestElement(int arr[], int k) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<k;i++)
		  pq.add(arr[i]);
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(pq.poll());
		}
		     
		
	}
	
	public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<arr.size();i++) {
			pq.add(arr.get(i));
		}
		return pq;
		
		
	}
	
	static int delete(PriorityQueue<Integer> q) {
		
		return q.poll();
		
	}
	
	public static int max_toys(int arr[], int k) {
		
		int res=0;
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(k>=0 && pq.isEmpty()==false && pq.peek()<=k) {
				k=k-pq.poll();
				res++;
			}
		return res;        
    }
	
	public static void printKMostFreq(int arr[],int k) {
		int n=arr.length;
		//step 1: count Frequency using HashMap
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0)+1);		
		}		
		// Step 2: Create frequency bucket (List of Lists)
		List<List<Integer>> freq=new ArrayList<List<Integer>>();
		for(int i=0;i<n;i++) {
			freq.add(new ArrayList<Integer>());
		}
		
		//Step 3: Populate bucket with elements at their frequency index
		for(Map.Entry<Integer,Integer> x: m.entrySet()){
			freq.get(x.getValue()).add(x.getKey());
		}
		
		//Step 4: Collect top K frequent elements from bucket
		int count=0;
		for(int i=n-1;i>0;i--) {
			for(int num:freq.get(i)) {
				System.out.print(num+" ");
				count++;
				if(count==k) return;
			}
		}
	}
	
	public static int minCost(int[] arr) {
		
	   int minCost=0;
	   int cost=0;
	   	   
	   PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	   Iterator<Integer> it=pq.iterator();
	   while(it.hasNext()) {
		   
	   }
	   for(int i=0;i<arr.length;i++) {
		   pq.add(arr[i]);	   
	   }
	   
	   //while(pq.isEmpty()==false)
	   for(int i=0;i<arr.length-1;i++)
	   {
		   int n =pq.poll();
		   cost=n + pq.poll();
		   pq.add(cost);
		   minCost=minCost+cost;
		   
	   }
		
		return minCost;
	}
	
	public static int KthLargest(int arr[], int k) {
        // Your code here
		int kthLargest=0;
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		for(int i=0;i<=arr.length;i++) {
			
			int n=pq.poll();
			//System.out.println(n);
			if(i==k-1) {
				kthLargest=n;
				break;
			} 
		}
		
		return kthLargest;
    }
	
	public static int kthSmallest(int arr[], int k) {
        // Your code here
		
		int kthSmallest=0;
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
       for(int i=0;i<arr.length;i++) {
			
			int n=pq.poll();
			//System.out.println(n);
			if(i==k-1) {
				kthSmallest=n;
				break;
			} 
		}
		
		return kthSmallest;
    }

}
