package day17;

import java.util.*;

public class task6 {

    public static long StringToNum(String s) {
        long num = 0;
        for (int i = 0; i < s.length(); i++) {
            num = num * 31 + (int) s.charAt(i);
        }
        return num;
    }

    public static int intercolle(String arr[], String s) {
        long key = StringToNum(s);
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            long lowValue = StringToNum(arr[low]);
            long highValue = StringToNum(arr[high]);

            if (key < lowValue || key > highValue) {
                return -1; 
            }

            if (low == high) { 
                return arr[low].equals(s) ? low : -1;
            }

           
            int pos = low + (int) ((key - lowValue) * (high - low) / (highValue - lowValue));

            if (pos < low || pos > high) { 
                return -1;
            }

            int compare = arr[pos].compareTo(s);

            if (compare == 0) {
                return pos; 
            } else if (compare < 0) {
                low = pos + 1; 
            } else {
                high = pos - 1; 
            }
        }
        return -1; 
    }

    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        String arr[] = ss.nextLine().split(" ");
        
        System.out.println("Enter the string to search:");
        String key = ss.next();

        int index = intercolle(arr, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

    }
}
