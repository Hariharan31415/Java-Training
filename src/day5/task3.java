package day5;

class First extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			
		}
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class task3 {
	public static void main(String args[])
	{
		
		System.out.println(Thread.currentThread());
		First f = new First();
		f.start();   // class thread is run
		
		f.run();  //main thread is run because the run() is treated as normal method 
	    
	    
		f.run(); // treated as main 
	}
}
