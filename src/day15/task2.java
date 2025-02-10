package day15;

class PriorityQueue{
int size, arr[],capacity;
public PriorityQueue(int capacity)
{
	this.capacity = capacity;
	arr = new int[capacity];
	size=0;			
}

public void insert(int val)
{
    if(size==capacity)
    {
    	System.out.println("queue is full");
    	return;
    }
    
    arr[size]=val;
    size++;
    System.out.println("inserted:"+val);

}

public int remove()
{
	int max=arr[0];
	if(size==0)
	{
		System.out.println("queue is empty");
		return 0;
	}
	for(int i=1;i<size;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		
	}
	
	int highPriority=max;
	
	for(int i=0;i<size-1;i++)
	{
		arr[i]=arr[i+1];
		size--;
		
	}
	
	
	return highPriority;
}
public boolean isEmpty()
{
	return size==0;
}
public void display()
{
	if(size==0)
	{
		System.out.println("size is empty");
		return ;
	}
	for(int  i=0;i<size;i++)
	{
		System.out.println(arr[i]);
	}
	

}
}

public class task2 {
public static void main(String args[])
{
	PriorityQueue pq = new PriorityQueue(5);
	pq.insert(10);
	pq.insert(40);
	pq.insert(50);
	
	System.out.println(pq.remove());
	System.out.println(pq.isEmpty());
	pq.display();
}
}
