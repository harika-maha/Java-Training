import java.util.Arrays;
import java.util.Scanner;

public class sumOfTwoLargest {
    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        int largest = 0;
        int index1 = 0;
        for(int i=0; i<size; i++){
            if(arr[i]>largest){
                largest = arr[i];
                index1 = i;
            }
        }
        largest = 0;
        int index2 = 0;
        for(int i=0; i<size; i++){
            if(arr[i]>largest && i!=index1){
                largest = arr[i];
                index2 = i;
            }
        }
        System.out.println(index1+index2);
    }
    
}
