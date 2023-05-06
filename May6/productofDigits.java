package May6;

import java.util.Scanner;

public class productofDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int product = 1;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            product *= digit;
            n /= 10;
            }
            System.out.println(product);
    }
}
