package day15;


class CircularQueue{
	int front,rear,size,capacity;
	int arr[];
	public CircularQueue(int capacity)
	{
		this.capacity=capacity;
		arr = new int[capacity];  
		front=-1;
		rear = -1;
		size=0;
	}
	
	public void enqueue(int val)
	{
		if(rear+1%capacity==front)
		{
			System.out.println("queue is full");
			return ;
		}
	  if(front==-1)
	  {
		front=0;
	   }
	 rear=(rear+1)%capacity;
	 arr[rear]=val;
	 size++;
	}
	
	public int dequeue()
	{
		if(front==-1)
		{
			System.out.println("queue is empty");
			
		}
		int remove = arr[front];
		if(front==rear)
		{
			front=rear=-1;
		}
		else
		{
			front=front+1%capacity;
		}
		size--;
		return remove;
	}
	
	public void display()
	{
		int i=front;
		if(front==-1)
		{
			System.out.println("queue empty...");
		}
		while(true)
		{
			if(i==rear) {
				break;
		     }
			System.out.println(arr[i]);
			i=i%capacity;
		}
		
	}
	
	
	public boolean isEmpty()
	{
		System.out.println(size);
		if(size==0)
			{
			  return true;
			}
		
		return false;
	}
}
public class task1 {
public static void main(String args[])
{
	CircularQueue cq = new CircularQueue(5);
	  cq.enqueue(10);
	  cq.enqueue(11);
	  cq.enqueue(22);
	  
	  
	  System.out.println(cq.dequeue());
	  System.out.println(cq.dequeue());
	  System.out.println(cq.dequeue());
	  
	  //System.out.println("check empty : " + cq.isEmpty());
	  System.out.println(cq.isEmpty());
	  
	
}
}
