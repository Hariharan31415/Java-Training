package day6;

class TaskThread extends Thread{
	private String ThreadName;
	public TaskThread(String ThreadName) {
		
		this.ThreadName=ThreadName;
	}
	public void run() {
		
		for(int i=0;i<3;i++)
		{
			System.out.println(this.ThreadName);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("all finished");
		}
		
	}
	
	
}
public class task1 {
public static void main(String args[])
{
	TaskThread t1 = new TaskThread("Thread1");
	TaskThread t2 = new TaskThread("Thread2");
	TaskThread t3 = new TaskThread("Thread3");
	
	t1.start();
	try {
		
		t1.join();  // the main block is wait until the t1 all execution are finished 
	}
	catch(InterruptedException e){
		System.out.println(e);
	}
	t2.start();
try {
		
		t2.join();  // the main block is wait until the t2 all execution are finished 
	}
	catch(InterruptedException e){
		System.out.println(e);
	}
t3.start();
try {
	
	t3.join();  // the main block is wait until the t3 all execution are finished 
}
catch(InterruptedException e){
	System.out.println(e);
}
    System.out.println("In main block :"+Thread.currentThread().getName());
}
}
