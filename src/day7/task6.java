package day7;

import java.util.PriorityQueue;

public class task6 {
public static void main(String args[])
{
	PriorityQueue q = new PriorityQueue();
	System.out.println(q.peek()); // empty P.queue (null)
	for(int i=0;i<5;i++)
	{
		q.offer(i); // add the element to the p(queue). 
	}
	System.out.println(q);
	
	System.out.println(q.poll()); // return 0 because FIFO order
	
	
}
}
