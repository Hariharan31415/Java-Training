package day15;
class Dqueue
{
	int front,rear,capacity,size,arr[];
	public Dqueue(int capacity)
	{
		this.capacity=capacity;
		front=0;
		rear=0;
		arr=new int[capacity];
		size=0;
	}
	
	public boolean isFull()
	{
		return size==capacity;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	public void addRear(int val)
	{
		if(isFull())
		{
			System.out.println("full");
		}
		arr[rear]=val;
		rear=(rear+1)%capacity;
		size++;
		
	}
	public void addFront(int val)
	{
		

		if(isFull())
		{
			System.out.println("full");
			return;
		}
		front=((front-1)+capacity); 
		arr[front]=val;
	    size++;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("empty");
			return;
			
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[front+i%capacity]);
			
			
		}
	}
	

	public int removeRear()
	{
		if(isEmpty())
		{
			System.out.println("Dequeue is empty");	
		}
		rear=(rear-1+capacity)%capacity;
		
		int remove = arr[rear];
		size--;
		return remove;         
	}

	public int removeFront()
	{
		if(isEmpty())
		{
			System.out.println("Dequeue is empty");	
		}
		int remove =arr[front];
		
		size--;
		return remove;
	}
}
public class task4 {
public static void main(String args[])
{
     Dqueue d = new Dqueue(5);
     d.addRear(10);
     d.addRear(1);
     d.addRear(14);
     d.display();
     d.addFront(10);
     System.out.println( d.removeRear());
    
     System.out.println(  d.removeFront());
     
     
}
}
