package day17;

import java.util.Arrays;

public class task9 {
	public static void selectionSort(int arr[])
	{
		int n= arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min_index = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			int temp = arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
public static void main(String args[])
{
	int arr[]= {12,5,3,27,32,8,3,1};
	selectionSort(arr);
}
}
