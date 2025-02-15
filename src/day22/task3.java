package day22;

public class task3 {

    public static void main(String[] args) {
        int arr[] = {10, 50, 30, 20, 40, 60, 70, 90};
        heapsort(arr);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void heapsort(int[] arr) {
        int n = arr.length;
        
        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        
        
        for (int i = n - 1; i > 0; i--) {
           
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
       
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
       
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
      
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }
}
