package day15;

class BlockingQueue{
	
	int front,rear,capacity,size,arr[];
	public BlockingQueue(int capacity)
	{
		this.capacity=capacity;
		front=0;
		rear=-1;
		arr=new int[capacity];
		size=0;
	}
	
	public synchronized void enqueue(int val)
	{
		if(size==capacity)
		{
			System.out.println("full");
			return;
		}
		while(size==capacity)
		{
			try {
			wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		    rear = (rear + 1) % capacity;  
	        arr[rear] = val;
	        size++;
	        System.out.println(val + "--> produced");
	        notifyAll();
		
	}
	
	public  synchronized void dequeue()
	{
		while(size==0)
		{
			System.out.println("empty");
		
		try {
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		}
		int remove=arr[front];
		front=(front+1)%capacity;
		size--;
		notifyAll();
		System.out.println("dequeued :"+remove);
		
		
	}
	
}
public class task3 {
public static void main(String args[]) throws InterruptedException
{
	BlockingQueue b = new BlockingQueue(5);

	Thread producer = new Thread(()->{
		for(int i=0;i<5;i++)
		   {
			   b.enqueue(i);
			   try {
				   Thread.sleep(1000);
			   }
			   catch(InterruptedException e) {
				   System.out.println(e);
			   }
			   
		   }});
	
	Thread consumer = new Thread(()->{
		for(int i=0;i<5;i++)
		   {
			   b.dequeue();
			   try {
				   Thread.sleep(1000);
			   }
			   catch(InterruptedException e) {
				   System.out.println(e);
			   }
			   
		   }});
     producer.start();
     Thread.sleep(1000);
     consumer.start();
   
  
}
}
