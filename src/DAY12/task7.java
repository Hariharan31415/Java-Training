package DAY12;
import java.util.*;
public class task7 {
public static void main(String args[])
{
    Scanner s = new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int arr[][] = new int[r][c];
    for(int i=0;i<r;i++)
    {
    	for(int j=0;j<c;j++)
    	{
    		arr[i][j] = s.nextInt();
    	}
    }
    int min=arr[0][0];
    for(int i=0;i<r;i++)
    {
    	for(int j=0;j<c;j++)
    	{
    		if(arr[i][j]<=min)
    		{
    			
    			min=arr[i][j];
    		}
    		
    		
    	}
    }
    
    System.out.println(min);

}
}
