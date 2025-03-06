package dev.lpa.domain;

public class Person {
	
	private String name="Geeks";
	private int age=10;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		
		Person p1=new Person();
		String name=p1.getName();
	    p1.setName("John");
	    String setname=p1.getName();
	    p1.setAge(21);
	    int age=p1.getAge();
		
		System.out.print(name+" "+setname+" "+age);
		
		int arr[] = { 65, 66, 67, 68};
        String s = new String(arr, 1, 3);
        System.out.println(s);
        
        String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		System.out.print(s1 == s2);
		System.out.print(" ");
		System.out.println(s1.equals(s2));
		
	}
		
}


