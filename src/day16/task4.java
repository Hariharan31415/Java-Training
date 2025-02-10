package day16;

class Node3 {
	
	int data;
	Node3 next;
	
	public Node3(int data)
	{
		this.data=data;
		next=null;
	}
	
	
}



class Queue
{
  Node3 rear,front = null;
  
  public void enqueue(int data)
  {
	  Node3 nn = new Node3(data);
	  if(rear==null && front==null)
	  {
		  rear=nn;
		  front=nn; 
          System.out.println("inserted :"+data);
	  }
	  else {
	   rear.next=nn;
	   rear=nn;
	   System.out.println("inserted:"+data);
	  }
	  
  }
 
public void dequeue()
{
	
 int dd = front.data;
 if(front==null)
 {
	 System.out.println("empty");
 }
 front=front.next;
 
 System.out.println(dd);

}

public boolean isEmpty()
{
   return front==null;	

}

public int peek()
{
if(rear!=null)
{
 return rear.data;
}

return -1;
}


public void display()
{
	
    if(front==null)
    {
    	System.out.println("fuih");
    	
    }
    	Node3 temp = front; 
    	while(temp!=null)
    	{
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    	
    }
  

}




public class task4{
	public static void main(String args[])
	{
		Queue q = new Queue();
		q.enqueue(20);
		q.enqueue(40);
		q.enqueue(60);
		q.enqueue(760);
		q.enqueue(860);
		q.enqueue(80);
		
		q.dequeue();
		q.dequeue();
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.peek());
		
		System.out.println("display");
		
		q.display();
		
		
		
		
		
	}
}