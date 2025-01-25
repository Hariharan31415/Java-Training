package day5;

class Second2 implements Runnable{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}
public class task6 {

	public static void main(String args[])
	{
		Second2 s = new Second2();
		Thread th = new Thread(s,"hari");
		th.start();
		Second2 s1 = new Second2();
		Thread th1 = new Thread(s1);
		th1.start();
		Second2 s2 = new Second2();
		Thread th2 = new Thread(s2,"haran");
		th2.start();
		
		Thread.yield();
	}
}
