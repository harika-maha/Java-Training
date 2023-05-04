public class kmp {
        public static void main(String[] args) {
            String s = "abcdabca";
            int[] lps = buildLPSArray(s);
            System.out.println(getLongestHappyPrefix(s, lps));
        }
        
        public static int[] buildLPSArray(String s) {
            int[] lps = new int[s.length()];
            lps[0] = 0;
            int i = 1, j = 0;
            while (i < s.length()) {
                if (s.charAt(i) == s.charAt(j)) {
                    lps[i] = j + 1;
                    i++;
                    j++;
                } else {
                    if (j == 0) {
                        lps[i] = 0;
                        i++;
                    } else {
                        j = lps[j-1];
                    }
                }
            }
            return lps;
        }
        
        public static String getLongestHappyPrefix(String s, int[] lps) {
            int n = s.length();
            int len = lps[n-1];
            return len > 0 && n % (n - len) == 0 ? s.substring(0, n - len) : "";
        }
}
