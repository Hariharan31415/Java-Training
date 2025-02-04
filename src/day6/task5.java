package day6;

import java.util.LinkedList;

public class task5 {
	public static void main(String args[])
	{
		LinkedList l1 = new LinkedList();
		l1.add("hari");
		l1.add("hello"); 
		l1.add("every"); 
		l1.add("one");
		l1.add("welcome");
	
		
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeLast());
		//l1.addFirst("first");
		System.out.println(l1);
		l1.set(1,"1 index" ); // replace the  1st index value but add only append the value 
		System.out.println(l1);
		l1.add(3," 0 th index");
		System.out.println(l1);
		l1.set(0,"1 index" );
		System.out.println(l1);
		
	}
}
