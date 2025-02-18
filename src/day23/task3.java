package day23;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int r=s.nextInt();
		int c = s.nextInt();
		int arr[][]= new int[r][c];
		for(int i=0;i<r;i++)
		{
			
			
			arr[i][0]=1;
			
		}
		for(int j=0;j<c;j++)
		{
			
			arr[0][j]=1;
			
		}
		
		
		for(int i=1;i<r;i++)
		{
		 for(int j=1;j<c;j++)
			{
			  arr[i][j]=arr[i][j-1]+arr[i-1][j];
		}}
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			
		}
		
		
		
		
	}
}
