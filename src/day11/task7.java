package day11;
import java.util.*;
public class task7 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
   String str = s.nextLine();
   String arr[] = str.split(" ");
   int ar[]= new int[arr.length];
   for(int i=0;i<arr.length;i++)
   {
	   ar[i]=Integer.parseInt(arr[i]);
   }
   
   for(int i=0;i<ar.length;i++)
   {
	   System.out.println(ar[i]);
   }
   
   
   
   
}
}
