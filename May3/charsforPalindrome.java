import java.util.Scanner;
public class charsforPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int minChars = getMinCharsToPalindrome(word);
        System.out.println("Minimum number of characters to make " + word + " a palindrome: " + minChars);
        scanner.close();
    }
    
    public static int getMinCharsToPalindrome(String word) {
        int len = word.length();
        int[][] dp = new int[len][len];
        
        for (int i = 0; i < len; i++) {
            dp[i][i] = 0;
        }
        
        for (int l = 2; l <= len; l++) {
            for (int i = 0; i < len - l + 1; i++) {
                int j = i + l - 1;
                if (word.charAt(i) == word.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i][j-1], dp[i+1][j]) + 1;
                }
            }
        }
        
        return dp[0][len-1];
    }
}
