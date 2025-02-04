package day7;
import java.util.ArrayList;
import java.util.Iterator;
;

public class task4 {
public static void main(String args[])
{
	ArrayList l = new ArrayList();
	
	//Iterator it = new Interator();
	for(int i=0;i<10;i++)
	{
		l.add(i);
	}
	Iterator it = l.iterator(); // iterate through l 
	
	while(it.hasNext())
	{
		int a = (Integer)it.next();
	
		if(a%2==0)
		{
			System.out.println(a);
		}
		else {
			//it.remove();
		}
	}
	System.out.print(l + " ");

}
}