package day8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class task3 {

	public static void main(String args[])
	{
		HashMap h = new HashMap();
		h.put("tea", 15);
		h.put("coffee", 30);
		h.put("dosa" , 50);
		h.put("idli",60);
		h.put("biryani", 200);
		Set entry = h.entrySet();  
		System.out.println(entry); 
		Iterator it = entry.iterator();
		while(it.hasNext())
		{
			Map.Entry mentry = (Map.Entry)it.next();
			if(mentry.getKey().equals("tea"))
			{
				mentry.setValue(20);
			}
			if(mentry.getValue().equals(200))
			{
				mentry.setValue(250);
			}
			//System.out.println(mentry);
			Integer val = (Integer)mentry.getValue();
			mentry.setValue(val+25);
			
			System.out.println(mentry);
			
		}
		System.out.println(h);
	                            
	}
}
