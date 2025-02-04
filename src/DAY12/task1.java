package DAY12;
import java.util.*;
public class task1 {
public static void main(String args[])
{
Scanner s = new Scanner(System.in);	
System.out.println("enter the size:");
int n=s.nextInt();
System.out.println("enter the array element:");
int arr[]= new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}

Arrays.sort(arr);
System.out.println("enter the val:");
int val=s.nextInt();

for(int i=n-1;i>=val;i--)
{
  System.out.println(arr[i]);	
}
}
}
