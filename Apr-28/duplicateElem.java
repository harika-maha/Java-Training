import java.util.Scanner;

public class duplicateElem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {2, 8, 9, 6, 9, 0};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                System.out.print(arr[i]+" ");
            }
        }
    }
}