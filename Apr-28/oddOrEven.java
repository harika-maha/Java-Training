import java.util.Scanner;

public class oddOrEven{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2!=0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}