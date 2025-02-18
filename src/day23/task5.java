package day23;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);	
	int n=s.nextInt();
	int wei[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	int profit[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	int W=s.nextInt();
	int cal[][]=new int[wei.length+1][W+1];
	for(int i=1;i<=n;i++)
	{
		for(int w=0;w<=W;w++)
		{
			if(wei[i-1]<=w)
			{
				cal[i][w]=Math.max(cal[i-1][w], profit[w]);}
		}
	}
	
	
	
	System.out.println("maximum profit :"+cal[n][W]);
	System.out.println("select weight :");
	int w=W;
	for(int i=n;i>=0 &&  w>0;i--)
	{
		if(cal[i][w]!=cal[i-1][w])
		{
			System.out.println(wei[i-1]+" ");
			w-=wei[i-1];
		}
	}
	System.out.println();
	
	
	}
}
