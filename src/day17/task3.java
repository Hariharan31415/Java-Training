package day17;

import java.util.Arrays;
import java.util.*;
public class task3 {
	public static int binarySearch(String arr[], String tar) {
	    int left = 0, right = arr.length - 1;
	    
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        int cmp = arr[mid].compareToIgnoreCase(tar); 
	        
	        if (cmp == 0) { 
	            System.out.println("Target found.");
	            return mid;
	        }
	        
	        if (cmp < 0) { 
	            left = mid + 1;
	        } else { 
	            right = mid - 1;
	        }
	    }
	    
	    return -1; 
	}

	
	
public static void main(String args[])
{
Scanner s = new Scanner(System.in);	
String arr[] = Arrays.stream(s.nextLine().split(" ")).toArray(String[]::new);

String tar = s.next();

int result=binarySearch(arr,tar);
System.out.println("ffh1");
System.out.println("target index :"+result);
if(result!=-1)
{

}





}
}
