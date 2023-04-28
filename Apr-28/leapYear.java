import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        if(val%4==0){
            if(val%100==0){
                if(val%400==0)
                    System.out.println("Leap year");
                else
                    System.out.println("Not a leap year");
            }
    }
    else
        System.out.println("Not a leap year");

    }
}
