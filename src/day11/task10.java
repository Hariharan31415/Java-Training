package day11;
import java.util.Scanner;
public class task10 {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int n;
	n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
}
}
