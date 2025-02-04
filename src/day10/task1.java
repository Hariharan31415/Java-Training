package day10;

interface Second{
	abstract void aclass(); // this is abstract class 
	
	default  void fun() { // this is a default method 
		System.out.println("default method ");
	}
	static void fun1() {
		System.out.println("static method of the error");
	}
	
}

class Summa implements Second{
	public void aclass()
	{
		System.out.println("over rided abstract method of inteface");
	}
	
}

public class task1 {
public static void main()
{
     //Summa s  = new Summa();
     //s.aclass();
     //s.fun();
	 Second s = new Summa();
	 s.aclass();
	 s.fun();
     
}
}

