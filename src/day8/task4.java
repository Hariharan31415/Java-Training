package day8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class task4 {

	public static void main(String args[])
	{
		HashMap h = new HashMap();
		h.put("tea", 15);
		h.put("coffee", 30);
		h.put("dosa" , 50);
		h.put("idli",60);                               // does not maintain the insertion order  
		h.put("biryani", 200);
		Set entry = h.entrySet();  
		System.out.println(entry); 
		Iterator it = entry.iterator();
		
		LinkedHashMap l = new LinkedHashMap();
		l.put("tea", 15);
		l.put("coffee", 30);                       // its maintain the  insertion order 
		l.put("dosa" , 50);
		l.put("idli",60);
		l.put("biryani", 200);
		
		System.out.println(l);
	                            
	}
}
