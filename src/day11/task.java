package day11;

import java.util.Scanner;

public class task {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int r,c;
		r=s.nextInt();
		c=s.nextInt();
		int arr[][]	= new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();
		}
		
		
		
	
	
	}
}
