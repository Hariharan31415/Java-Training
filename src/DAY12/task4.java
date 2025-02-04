package DAY12;
import java.util.*;
class Order1{
	int id,val;
	public Order1(int id,int val)
	{
		this.id=id;
		this.val=val;
	}
	
	
		
}

public class task4 {
public static void main(String args[])
{
	Order1[] order = { new Order1(1,2000),new Order1(2,300),new Order1(3,14000),new Order1(4,5000)};
    int k=2;
    PriorityQueue<Order1> pq = new PriorityQueue<>(k,Comparator.comparing(o->o.val));
    
    for(Order1 o : order)
    {
    	pq.offer(o);
    	if(pq.size() > k)
    	{
    	   pq.poll();	
    	}
    }
    
    while(!pq.isEmpty())
    {
    	Order1 order1 =pq.poll();
    	System.out.println("order id :"+order.id+"order value:"+order.val);
    }
    
    
}
}
