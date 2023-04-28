import java.util.Scanner;

public class printLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the 2D arrays");
        int n1 = scan.nextInt();
        int m1 = scan.nextInt();

        int[][] arr1 = new int[n1][m1];
        

        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                arr1[i][j] = scan.nextInt();
            }}
        
            int largest = 0;
            for(int i=0; i<n1; i++){
                for(int j=0; j<m1; j++){
                    if(arr1[i][j]>largest)
                        largest = arr1[i][j];
                }}
            System.out.println(largest);
    }
    
}
