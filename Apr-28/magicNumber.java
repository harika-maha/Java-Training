import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // int count = 0;
        // int temp = num;
        // while(temp>0){
        //     temp = temp/10;
        //     count++;
        // }
        // System.out.println(count);
        // temp = num;
        // int sum = 0;
        // int newNum = 0;
        // int iteration = 0;
        // // while(iteration<=count){
        // //     if(temp==0)
        // //         break;
        // //     sum+= temp%10;
        // //     System.out.println(sum);
        // //     temp = temp/10;
        // //     iteration++;
        // // }
        // while(temp>0){
        //     sum+=temp%10;
        //     temp = temp/10;
        // }
        // newNum = sum;
        // while(newNum>10){

        // }

        // System.out.println(sum);
      
    // Accepting sample input
    int x = 1234;
  
    // Condition to check Magic number
    if (x % 9 == 1)
        System.out.printf("Magic Number");
    else
        System.out.printf("Not a Magic Number");
}
}
//1 + 0 = 1