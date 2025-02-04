package day6;

import java.util.ArrayList;

public class task2 {

	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList(10);
		ArrayList l2 = new ArrayList(20);
		System.out.println(l1);  // empty --> []
		System.out.println(l2);  // empty --> []
		System.out.println(l1.size()); // size --> 0
		System.out.println(l2.size()); // size --> 0
		l1.add(1); // add to --> l1
		l1.add(2); // add to --> l1
		System.out.println(l1.size()); // size --> 2
		System.out.println(l1); // print l1 --> [1,2]
		l2.addAll(l1); // add the all element of the l1 to the l2
		System.out.println(l2.size());// size --> 2
		System.out.println(l2); // print l1 --> [1,2]
		 
		ArrayList l3 = new ArrayList(l2); // copy the l2 list to l3  
		System.out.println(l3); // print --> [1,2]
		
		l3.add(l2); // add the l2 list
		System.out.println(l3); // it print[1,2,[1,2]]
		
	    
	}
}
