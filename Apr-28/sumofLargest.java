import java.util.Arrays;
import java.util.Scanner;

public class sumofLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        int sum = arr[size-1] + arr[size-2];
        System.out.println(sum);
    }
    
}
