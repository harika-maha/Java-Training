import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int first = 0;
    int second = 1;
    int third = 1;
    System.out.println(first+" "+second+" "+third);
    while(num>0){
        first = second;
        second = third;
        third = first + second;
        System.out.print(third + " ");
    }
    }
}
