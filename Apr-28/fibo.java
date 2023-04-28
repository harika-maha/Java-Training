import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int first = 0;
        int second = 1;
        int third;
        System.out.print(first+" "+second+" ");
        int k = 2;
        while(k<num){
            third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
            k++;
        }
    }
}
