package day23;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
	
	public static int countWay(int coin[],int amount)
	{
		int dp[]=new int[amount+1];
		dp[0]=1;
		for(int c:coin)
		{
			for(int i=c; i<=amount;i++)
			{
				dp[i]+=dp[i-c];
			}
		}
		
		
		System.out.println("dp table :"+Arrays.toString(dp));
		return dp[amount];
		
		
	}
	public static void main(String args[])
	{
	
	int coin[] = {2,3,7};
	int amount=7;
	System.out.println(countWay(coin,amount));
}
}
