package day18;

import java.util.Scanner;

public class task3 {
	public static void fact(int n)
	{
		int fact =1;
		
		for(int i=n;i>0;i++)
		{
			fact = fact *i;
			System.out.println("loop");
		}
		System.out.println(fact);
		
		
		
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		fact(n);
		
	
	
	
	}
}
