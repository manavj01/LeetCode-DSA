class Solution {

    public String longestPalindrome(String s) {
        int len = s.length();
        int r=0,c=0;
        boolean[][] dp = new boolean[len][len];
        // int c = 0;
        int maxlen = 0;
        for (int g = 0; g < len; g++) {
            for (int i = 0, j = g; j < len; i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true) {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j]) {
                    if (maxlen < s.substring(i, j + 1).length()) {
                    r =i;
                    c = j;
                    }
                }
            }
        }

        return s.substring(r,c+1);
    }
}
