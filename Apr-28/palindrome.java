import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String newStr = "";
        for(int i=str.length()-1; i>=0; i--){
            newStr += str.charAt(i);
        }
        if(str.equals(newStr)){
            System.out.println("It is a palindrome");
        }
        else
        System.out.println("Not a palindrome");
    }
}
