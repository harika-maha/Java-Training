import java.util.Scanner;

public class naturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=0){
            System.out.println("Not a natural number");
        }
        else{
            System.out.println("Natural number");
        }
    }   
}
