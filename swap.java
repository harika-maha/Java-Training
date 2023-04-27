import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first variable: ");
        int var1 = input.nextInt();

        System.out.print("Enter the second variable: ");
        int var2 = input.nextInt();

        System.out.println("Before swapping:");
        System.out.println("Variable 1 = " + var1);
        System.out.println("Variable 2 = " + var2);
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("After swapping:");
        System.out.println("Variable 1 = " + var1);
        System.out.println("Variable 2 = " + var2);
    }
}