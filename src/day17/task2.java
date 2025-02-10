package day17;

import java.util.Arrays;
import java.util.*;
public class task2 {
	
public static int binarySearch(int arr[],int tar)
{
	int left=0 , right=arr.length-1;
	while(left<=right)
	{
		int mid = left+(right-left)/2;
		if(arr[mid]==tar)
		{
			System.out.println("target found..");
			return mid;
		}
		
		if(arr[mid]<tar)
		{
			left=mid+1;
		}
		else
		{
			right=mid-1;
		}
	
	}
	
	return -1;
}
	
	
	
public static void main(String args[])
{
Scanner s = new Scanner(System.in);	
int arr[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

int tar = s.nextInt();

int result=binarySearch(arr,tar);
System.out.println("ffh1");

if(result!=-1)
{
System.out.println("target index :"+result);
}





}
}
