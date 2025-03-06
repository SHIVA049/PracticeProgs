package dev.lpa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] nums= {3,2,2,7,5,1,9,7};
		
		List<Integer>nums1=Arrays.asList(3,2,2,7,5,1,9,7);
		
		//nums1.stream().distinct().forEach(s->System.out.print(s+" "));
		
		//nums1.stream().sorted().forEach(s->System.out.print(s+" "));
		
		int a=nums1.stream().distinct().sorted().collect(Collectors.toList()).get(2);
		System.out.println(a);
		//nums1.stream().distinct().

	}

}
