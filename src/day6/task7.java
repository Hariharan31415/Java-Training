package day6;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class task7 {
	public static void main(String args[])
	{
	       LinkedHashSet l1 = new LinkedHashSet();
	       l1.add("hari");
			l1.add("hello"); 
			l1.add("every"); 
			l1.add("one");
			l1.add("welcome");
			l1.add("welcome"); // if the duplication is added to the hashSet it simply ignore 
			
			System.out.println(l1); // if print the set it can not main the insertion order 
	       
		
	}
}
