package day8;

import java.util.HashMap;

public class task1 {
	public static void main(String args[])
	{
		HashMap h = new HashMap();
		h.put("tea", 15);
		h.put("coffee", 30);
		h.put("dosa" , 50);
		h.put("idli",60);
		System.out.println(h);
		h.put("birr", 15);
		System.out.println(h.put("bir", 15));
		System.out.println(h);
		h.put("tea", 99);
		System.out.println(h);
	}
}

