package day17;

import java.util.Arrays;
import java.util.*;
public class task7 {
	
public static int jumpSearch(int arr[],int key)
{
	int n= arr.length;
	int step = (int)Math.floor(Math.sqrt(n));
	int prev = 0 ;
	while (arr[Math.min(step, n) - 1] < key) {
        prev = step;
        step += (int) Math.floor(Math.sqrt(n));
        // If we've reached the end of the array, 
        //the element is not present.
        if (prev >= n) {
            return -1;
        }
    }
    
    // Perform linear search within the identified block
    while (arr[prev] < key) {
        prev++;
        // If we reach the end of the block or array
        //without finding the key
        if (prev == Math.min(step, n)) {
            return -1;
        }
    }
    
    // Check if the element at index 'prev' is
    //the target element.
    if (arr[prev] == key) {
        return prev;
    }
    return -1;
}

	
	
	
public static void main(String args[])
{
Scanner s = new Scanner(System.in);	
int arr[] = {1,2,3,4,5,6,7,8,9,10};

int tar = 4;

int result=jumpSearch(arr,tar);
System.out.println(result);






}
}
