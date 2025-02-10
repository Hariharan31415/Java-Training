package day17;
import java.util.*;
public class task4 {
	
	public static int squrt(int n)
	{
		int left=1,right=n,ans=0;
		if(n==0 || n==1)
		{
			return n;
		}
		while(left<=right)
		{
			int mid = left+(right-left)/2;
			if(mid==n/mid)
			{
				return mid;
			}
			if(mid<n/mid)
			{
				left=mid+1;
				ans=mid;
			}
			else {
				right=mid-1;
			}
			
		}
		return ans;
	}
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	System.out.println("square root of :"+n+" is :"+squrt(n));
	System.out.println(25/2);
	
}
}
