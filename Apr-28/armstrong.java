import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        int count = 0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = num;
        int sum = 0;
        while(temp>0){
            sum+=Math.pow((temp%10),count);
            temp = temp/10;
        }
        if(num==sum)
            System.out.println("It is an armstrong number");
        else
            System.out.println("Not an armstrong number");
    }
}
