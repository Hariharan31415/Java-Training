package day4;
import java.util.Scanner;
import java.util.*;
class Second1{
	int arr[]= {1,45,23,4};
	void firstcall()
	{
		int  h= secondcall();
		System.out.println(h);
		
	}
	int secondcall() {
		int c;
		Scanner s = new Scanner(System.in);
		System.out.println("second call block");
		try {
		int b=5/8;
		c=s.nextInt();
		//System.out.println(arr[9]);
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
			return 1;
			
		}
		catch(InputMismatchException in) 
		{
			
			System.out.println(in);
			return 2;
		}
		catch(Exception exe) 
		{
			System.out.println(exe);
			System.out.println("exception");
			return 3;
			
		}
		finally {
			System.out.println("finally statement "); // this is executed when error occur or not 
            //return 11;		
		}
		return 11;
		
	}
	
}

public class task4 {
	public static void main(String args[]) {
		Second1 s = new Second1();
		s.firstcall();
	}
}
