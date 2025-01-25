package day4;
class Second{
	
	void firstcall()
	{
		secondcall();
		
	}
	void secondcall() {
		System.out.println("second call block");
		try {
		int b=5/0;
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
			
		}
		
	}
	
}

public class task3 {
	public static void main(String args[]) {
		Second s = new Second();
		s.firstcall();
	}
}
