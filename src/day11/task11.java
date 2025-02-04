package day11;
import java.util.Scanner;
public class task11 {
public static void main(String args[])
{
	Scanner s = new Scanner (System.in);
	System.out.println("no of class :");
	int cls = s.nextInt();
	System.out.println("No of student :");
	int ss = s.nextInt();
	System.out.println("No of Mark :");
	int mark=s.nextInt();
	int arr[][][] = new int[cls][ss][mark];
	
	for(int c=0;c<cls;c++)
	{
		System.out.println("enter the class :" + c);
	
	for(int st=0;st<ss;st++)
	{
		System.out.println("enter the student :" + st); 
		for(int m=0;m<mark;m++)
		{
			System.out.println("enter the mark :" + m);
			arr[c][st][m]=s.nextInt();
		}
	}
	}
	
	for(int c=0;c<cls;c++)
	{
		System.out.println("class :" + c);
	
	for(int st=0;st<ss;st++)
	{
		System.out.println("student :" + st); 
		for(int m=0;m<mark;m++)
		{
			System.out.println("mark :" + m);
			System.out.println(arr[c][st][m]);
		}
	}
	}
}
}
