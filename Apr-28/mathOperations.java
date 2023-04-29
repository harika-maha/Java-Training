import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add\n2.Subtract\n3.Multiply\n4.Divide");
        int choice = scan.nextInt();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        switch(choice){
            case 1: add(num1, num2);
            break;
            case 2: sub(num1, num2);
            break;
            case 3: multiply(num1, num2);
            break;
            case 4: divide(num1, num2);
            break;
        }
    }
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void sub(int num1, int num2){
        System.out.println(num2-num1);
    }
    static void multiply(int num1, int num2){
        System.out.println(num1*num2);
    }
    static void divide(int num1, int num2){
        System.out.println(num1/num2);
    }
}
