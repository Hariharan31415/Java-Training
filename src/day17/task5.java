package day17;

import java.util.Arrays;
import java.util.*;
public class task5 {
	public static int intercolletional(int arr[] , int key)
	{
		int low = 0,high = arr.length-1;
		while(low<=high && key>=arr[low] && key <=arr[high])
		{
			if(low==high)
			{
				if(arr[low]==key)
				{
					return low;
				}
				else {
					return -1;
				}
			}
			int pos = low + ((key-arr[low])*(high-low))/ (arr[high]-arr[low]);
			
			if(arr[pos]==key)
			{
				return pos;
			}
			if(arr[pos]<key)
			{
				low=pos+1;
			}
			else {
				high=pos-1;
			}
		}
		return -1;
	}
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int arr[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	int key=s.nextInt();
	
	
	int rs =  intercolletional(arr,key);
	if(rs!=-1)
	{
	System.out.println("element found "+rs);
	}
	else{System.out.println("not found");
}}
}
