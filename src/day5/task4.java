package day5;
class Second1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}
public class task4 {

	public static void main(String args[])
	{
		Second1 s = new Second1();
		s.run();
		Thread th = new Thread(s); //copy the second1 obj to the thread class
		th.start();
		Second1 s1 = new Second1();
		Thread th1 = new Thread(s1,"hari");
		th1.start();
	}
	
}
