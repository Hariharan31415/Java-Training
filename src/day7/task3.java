package day7;

import java.util.Enumeration;
import java.util.Vector;

public class task3 {
public static void main(String args[])
{
	Vector v  = new Vector();
	for(int i=0;i<10;i++)
	{
		v.addElement(i);
	}
	
	
	Enumeration e = v.elements();
	while(e.hasMoreElements())
	{
		int a = (Integer)e.nextElement();
		if(a%2==0)
		{
		System.out.print(a+" ");
	}}

}
}