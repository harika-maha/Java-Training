package May4;

public class minimumDeletions {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};
        int[] numsDivide = {5, 10, 15};
        System.out.println(minimumDeletions(nums, numsDivide)); // Output: 2
    }
    
    public static int minimumDeletions(int[] nums, int[] numsDivide) {
        int minNum = Integer.MAX_VALUE;
        for (int num : nums) {
            minNum = Math.min(minNum, num);
        }
        
        for (int numDivide : numsDivide) {
            if (numDivide % minNum != 0) {
                return -1;
            }
        }
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int maxSubsequence = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            maxSubsequence = Math.max(maxSubsequence, dp[i]);
        }
        
        return n - maxSubsequence;
    }
}
