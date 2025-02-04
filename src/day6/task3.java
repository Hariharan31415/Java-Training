package day6;


import java.util.*;

public class task3 {

	public static void main(String args[])
	{
		Vector l1 = new Vector();
		ArrayList l2 = new ArrayList(20);
		l1.add(1); 
		l1.add(2); 
		l1.add(4);
		l1.add('g'); 
		
		List l4 = Collections.synchronizedList(l2);

	    System.out.println(l1);
		
	    
	}
}
