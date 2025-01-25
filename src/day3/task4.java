package day3;

class third
{
	
	void fun()
	{
		System.out.println("third fun");
	}
	void fun3()
	{
		System.out.println("third fun3");
	}
}
class second extends third
{
	
	void fun()
	{
		System.out.println("second fun");
	}
	void fun2()
	{
		System.out.println("second fun2");
	}
}

public class task4 {
	public static void main(String args[])
	{
		third th = new second();
		second s = new second();
		
		s.fun();
		s.fun2();
		s.fun3();
		
		th.fun();
		th.fun3();
		//th.fun2(); cannot acces by the third class because the third(parent class) cannot access the methos of the child class
		
		second s1= (second)th; // downcast 
		s1.fun3();
		s.fun();
		
		
		
		
	}

}
