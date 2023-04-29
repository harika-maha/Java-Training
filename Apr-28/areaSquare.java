import java.util.Scanner;

public class areaSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        System.out.println("Area is: "+ side*side);
        System.out.println("Perimeter is: "+ 4*side);
    }
}
