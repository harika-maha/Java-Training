import java.util.Scanner;

public class ToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        System.out.println("1. Binary to Decimal\n2. Octal to Decimal\n3.Hexa to Decimal\n4. Decimal to Binary\n5. Decimal to Hexa");
        int choice = scan.nextInt();
        switch(choice){
            case 1: System.out.println(Integer.parseInt(num, 2));
            break;
            case 2: System.out.println(Integer.parseInt(num, 8));
            break;
            case 3: System.out.println(Integer.parseInt(num, 16));
            break;
            case 4: System.out.println(Integer.toBinaryString(Integer.parseInt(num)));
            break;
            case 5: System.out.println(Integer.toHexString(Integer.parseInt(num)));
            break;
        }    }
}
