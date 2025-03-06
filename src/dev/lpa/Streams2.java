package dev.lpa;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       ArrayList<String> names = new ArrayList<String>();
		
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alkhya");
		names.add("Anil");
		names.add("Akhilesh");
		names.add("Pradeep");
		names.add("Shukla");
		
		ArrayList<String> names1= new ArrayList<String>();
		
		Stream names2=Stream.of("Veena","Sangeeta","Shridevi","Roopa","Vijayalakshmi");
		
		
		//Count the names/items in arraylist starting with Letter A
		/*Long count =names.stream().filter(p->p.startsWith("A")).count();
		
		System.out.println(count); */
		
		//names.stream().filter(s->s.startsWith("A")).limit(2).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.startsWith("A")).limit(2).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.endsWith("a")).map(s->s.replace('l', 's')).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.contains("i")).sorted().forEach(s->System.out.println(s));
		//names.stream().filter(s->s.contains("i")).anyMatch(s->s.strip
		
		Stream.concat(names2, names.stream()).sorted().forEach(s->System.out.println(s));
	}

}
