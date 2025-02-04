package day8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class task2 {

	public static void main(String args[])
	{
		HashMap h = new HashMap();
		h.put("tea", 15);
		h.put("coffee", 30);
		h.put("dosa" , 50);
		h.put("idli",60);
		h.put("biryani", 200);
		Set entry = h.entrySet();  // get the key=value pair in the form of set  
		System.out.println(entry); 
		Iterator it = entry.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	                            
	}
}
