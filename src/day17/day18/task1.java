package day18;
import java.util.*;
public class task1 {
	
	public static void quickSort(int arr[],int start , int end)
	{
		if(start<end)
		{	
		  int parind=partition(arr,start,end);
		  quickSort(arr, start, parind - 1);
          quickSort(arr, parind + 1, end);
			
		}
		
		
	}
	
	public static int partition(int arr[],int start , int end)
	{
		int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

		
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
	    int arr[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    int n = arr.length;
	    
	    quickSort(arr,0,n-1);
	    
	    System.out.println(Arrays.toString(arr));
	 }
}
