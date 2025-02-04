package day8;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator{
	
	public int compare(Object ob1 , Object ob2)
	{
		String s1 = (String)ob1;
		String s2 = (String)ob2;
		return s2.compareTo(s1);
	}
}
public class task5 {

	public static void main(String args[])
	{
		TreeMap t = new TreeMap(new MyComparator());
		t.put("tea",1);
		t.put("coffee",2);
		t.put("dosa",3 );
		t.put("idli",4);                               

		System.out.println(t); 
	
		
        //System.out.println();
	                            
	}
	
}

