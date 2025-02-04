package day6;

import java.util.ArrayList;
import java.util.Vector;

public class task4 {
	public static void main(String args[])
	{
		//Vector l1 = new Vector();
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("hello"); 
		l1.add("every"); 
		l1.add("one");
		l1.add("welcome");
	
		//l1.add(53);
		for(String a:l1)
		{
			System.out.println(a);
		}
	}
}
