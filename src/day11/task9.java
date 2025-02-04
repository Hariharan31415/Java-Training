package day11;

import java.util.Arrays;

public class task9 {
public static void main(String args[])
{
	int i=0;
	int arr[] = {1,2,3,4,5};
	char arr1[] = {'q','u','e','e','n'};
	String arr2[] = {"hari","haran"};
	System.out.println(arr);  // it print the hash code .
	System.out.println(Arrays.toString(arr)); // print the array 
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    
    for(i=0;i<arr1.length;i++)
    {
    	System.out.print(arr1[i]+" ");
    }
    for(i=0;i<arr2.length;i++)
    {
    	System.out.print(arr2[i]+" ");
    }
    
}
}
