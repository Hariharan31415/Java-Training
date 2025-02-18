package day23;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int i=s.nextInt();
	int arr[] = new int[20];
	arr[0]=0;
	arr[1]=1;
	for(int j=2;j<i;j++)
	{
		arr[j]=arr[j-1]+arr[j-2];
	}
	System.out.println(Arrays.toString(arr));

}
}
