package DAY12;
import java.util.Arrays;
import java.util.Scanner;
public class task2 {
	public static void  main(String args[]) {
		Scanner s = new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int arr[][] = new int[r][c];
 		System.out.println("array:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
	
		
		System.out.println("enter key val:");
		int key=s.nextInt();
		
		for (int i = 0; i < r - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < r; j++) {
                if (arr[j][1] < arr[min_idx][1]) {
                  
                    min_idx = j;
                }
            }

            int temp = arr[i][1];
            arr[i][1] = arr[min_idx][1];
            arr[min_idx][1] = temp;           
        }
		
		for(int i=r-key;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			    System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
