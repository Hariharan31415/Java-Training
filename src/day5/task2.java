package day5;

class Second{
	
	void fun()
	{
		System.out.println("second fun..");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		//Thread.currentThread().setId(12);
	}
}

public class task2 {

	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			//System.out.println("main");
 
		}
		Second s = new Second();
		s.fun();
		
	}
}

