package day5;

class ThreadClass implements Runnable
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			//System.out.println(Thread.currentThread().getPriority());
			Thread.yield();
		}
	}
}
public class task7 {

	public static void main(String args[])
	{
		ThreadClass th = new ThreadClass ();
		Thread t1= new Thread(th,"T1");
		t1.start();
		System.out.println(t1.getPriority());
		ThreadClass th1 = new ThreadClass ();
		Thread t2= new Thread(th1,"T2");
		t2.start();
		System.out.println(t2.getPriority());
		t2.setPriority(10);
		
	}
}
