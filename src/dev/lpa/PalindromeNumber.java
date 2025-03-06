package dev.lpa;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5554;
		int reversedNum = 0 ;
		int remainder = 0;
		int originalNum = num;
		
	while(num != 0) {
		
		remainder= num % 10;
		reversedNum = reversedNum * 10 + remainder ;		
		num = num / 10 ;
		
	}
	
	if(reversedNum == originalNum) {
		System.out.println(originalNum + " is a palindrome Number");
	}else {
		System.out.println(originalNum + " is not a palindrome Number");
	}
	
	}

}
