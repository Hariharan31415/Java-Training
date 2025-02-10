package day14;

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
	
	public void enqueue()
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
	 arr[rear]=(rear+1)%capacity;
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
		
		return remove;
	}
}
public class task10 {
public static void main(String args[])
{
	CircularQueue cq = new CircularQueue(5);
	
	
}
}
