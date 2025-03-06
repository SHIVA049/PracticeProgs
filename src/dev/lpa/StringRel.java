package dev.lpa;

public class StringRel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String carName = "Radar";
		int len =carName.length();
		String newCarName = "";
	    
		
		/*for(int i=len-1; i>=0; i--) {
			
		     newCarName= newCarName + carName.charAt(i);					
		}
		
		if(carName.toLowerCase().equals(newCarName.toLowerCase())) {
			System.out.println(carName + " is a Palindrome String");
		}else {
			System.out.println(carName + " is not a Palindrome String");	
		} */
		
		for(int i=0; i<=len-1;i++) {
			
			newCarName = newCarName + carName.charAt(i) + "$";
		}
		
		System.out.println(newCarName);

	}
	
	
	
	
  	

}
