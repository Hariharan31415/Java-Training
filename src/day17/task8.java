package day17;

import java.util.Arrays;

public class task8 {
	public static void bubbleSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			boolean swap = false;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) break;
		}
		
		System.out.println(Arrays.toString(arr));
		
		 
	}
public static void main(String args[])
{
	
  int arr[]= {12,55,2,554,78,1,8};
  bubbleSort(arr);


}
}
