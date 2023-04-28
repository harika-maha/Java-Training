import java.util.Arrays;
import java.util.Scanner;

public class matrixSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the 2D arrays");
        int n1 = scan.nextInt();
        int m1 = scan.nextInt();
        int[][] arr1 = new int[n1][m1];
        int[][] arr2 = new int[n1][m1];
        int[][] arr3 = new int[n1][m1];
        int sum = 0;
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                arr1[i][j] = scan.nextInt();
            }}
            for(int i=0; i<n1; i++){
                for(int j=0; j<m1; j++){
                    arr2[i][j] = scan.nextInt();
                }}
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
//[1 2 3    [1 2 3
// 4 5 6    4 5 6
// 7 8 9]   7 8 9]