package day17;

import java.util.Arrays;
import java.util.*;
public class task1 {
public static void main(String args[])
{
Scanner s = new Scanner(System.in);	
int arr[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

int tar = s.nextInt();
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==tar)
	{
		System.out.println("value found at index :"+i+"value :"+tar);
	}
	System.out.println("value is not present in array ");
}




}
}
