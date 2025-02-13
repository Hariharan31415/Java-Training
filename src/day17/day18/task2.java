package day18;

import java.util.*;

public class task2 {
	
	public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

       
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
      
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int arr[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer ::parseInt).toArray();

	 insertionSort(arr,arr.length);

}
}
