import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Positive Number");
        }
    }
}
