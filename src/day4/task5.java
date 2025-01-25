package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{
	public MyException(String msg)
	{
		super(msg);
	}
	
	
}
class First{
	int arr[]= {1,45,23,4};
	void firstcall()
	{
		 secondcall();
		
		
	}
	void secondcall() {
		int c;
		Scanner s = new Scanner(System.in);
		System.out.println("second call block");
		try {
		int b=5/8;
		c=s.nextInt();
		//System.out.println(arr[9]);
		throw new MyException("customer exception");
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
			
			
		}
		catch(InputMismatchException in) 
		{
			
			System.out.println(in);
			
		}
		catch(Exception exe) 
		{
			System.out.println(exe);
			System.out.println("exception");
			
			
		}
		finally {
			System.out.println("finally statement "); // this is executed when error occur or not 
            		
		}
		
		
	}
	
}

public class task5 {
public static void main(String args[])
{
    
	First f = new First();
	f.firstcall();
	
}
}
