
package day7;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 =(String) obj1;
		String s2 =(String) obj2;
		return -s1.compareTo(s2); // desending order
		
	}
}
public class task7 {
	public static void main(String args[])
	{
		PriorityQueue q = new PriorityQueue(new MyComparator());
		q.offer("hi");
		q.offer("hello");
        q.offer("queue");
        q.offer("list");
        System.out.println(q);
        
        
		
}}
