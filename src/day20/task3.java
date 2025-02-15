package day20;
import java.util.*;

public class task3 {
    
    public static void adjMatrix(int[][] arr, int row) {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < row; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Number of nodes: ");
        int row = s.nextInt();
        System.out.print("Number of edges: ");
        int edges = s.nextInt();
        System.out.print("Is the graph directed (yes/no): ");
        String dir = s.next();

        int arr[][] = new int[row + 1][row + 1];

        for (int i = 1; i <= edges; i++) {
            System.out.println("Enter source, destination, and weight:");
            int sn = s.nextInt();
            int dn = s.nextInt();
            int weight = s.nextInt();

            if (dir.equals("yes")) {
                arr[sn][dn] = weight; 
            } else {
                arr[sn][dn] = weight;
                arr[dn][sn] = weight; 
            }
        }

        
        adjMatrix(arr, row + 1);
        
        
    }
}
