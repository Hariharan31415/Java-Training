package day14;

class QueueArray {
    int front, rear, size, capacity;
    int arr[];

    public QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];  
        front = 0;
        rear = -1;
        size = 0;
        
    }

    public void Enqueue(int val) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;  
        System.out.println(rear);
        arr[rear] = val;
        size++;
        System.out.println(val + " enqueued to queue");
    }
    
   public int Dequeue()
   {
	   if(size==0)
	   {
		   System.out.println("underflow");   
	   }
	   int remove=arr[front];
	   front=(front+1)%capacity;
	   size--;
	   return remove;
	   
   }
   
   public boolean isEmpty() {
	   
	   if(size==0)
	   {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   public int peek()
   {
	   return arr[rear];
	   
   }
   public void display()
   {
	   
	   if(size==0)
	   {
		   System.out.println("empty");
	   }
	   for(int i=0;i<size;i++)
	   {
		   front=(front+i)%capacity;
		   System.out.println(arr[front]);
		   
	   }
	   
	   
   }
}


public class task6 {
public static void main(String args[])
{
  QueueArray a = new QueueArray(3);
  System.out.println("enter the value for enqueue operation :");
  a.Enqueue(10);
  a.Enqueue(20);
  a.Enqueue(30);
  
  
  System.out.println(a.Dequeue());
  
  
  System.out.println("check empty : " + a.isEmpty());
  
  System.out.println("peek value :"+a.peek());
  a.display();
  //a.Enqueue(10);
  a.display();
  
  
  
}
}
