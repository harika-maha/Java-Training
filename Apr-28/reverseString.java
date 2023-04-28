import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        String string;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        string = scan.nextLine();

        char[] revstr = new char[string.length() + 1];

        int k = 0;
        for(int i = string.length() - 1; i >= 0; i--) {

            if(Character.isLetter(string.charAt(i))) {

                revstr[k] = string.charAt(i);
                count = count + 1;
                k = k + 1;
            }

        }

        for(int i = 0; i < string.length(); i++) {

            if((Character.isLetter(string.charAt(i))==false)) {

                for(int j = count; j >= i; j-- ) {
                    revstr[j + 1] = revstr[j];
                }
                count = count + 1;
                revstr[i] = string.charAt(i);
            }
        }
        for(int i = 0; i < string.length(); i++)
            System.out.print(revstr[i]);



    }
}
