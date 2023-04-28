import java.util.Scanner;

public class roots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double squarert = Math.sqrt(num);
        double cubert = Math.cbrt(num);
        System.out.println(squarert + " " + cubert);
    }
    
}
