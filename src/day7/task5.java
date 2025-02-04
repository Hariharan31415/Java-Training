package day7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
;

public class task5 {
public static void main(String args[])
{
	ArrayList l = new ArrayList();
	l.add("hari");
	l.add("haran");
	l.add("welcome");
	l.add("myClass");
	ListIterator li = l.listIterator(); // listiterator iterate through li 
	
	System.out.println(l);
	while(li.hasNext())
	{
		String a = (String)li.next();
	
		if(a.equals("haran"))
		{
			li.remove();
		}
        //System.out.println(a);
		
        if(a.equals("welcome"))
        {
        	li.set("TO All OF YOU");
        }
        //System.out.println(a);
        if(a.equals("myClass"
        		))
        {
        	li.add("listen");
        }
	}
	System.out.println(l);
	while(li.hasPrevious())
	{
		String a = (String)li.previous();
		System.out.print(a);
		
	}
	//System.out.println(l);


}
}