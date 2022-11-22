class Solution {
    public int climbStairs(int n) {
//         if(n == 0) return 0;
//         if(n == 1) return 1;
//         if(n == 2) return 2;
        
//         int ones  = climbStairs(n-1);
//         int twos = climbStairs(n-2);
        
//         return ones+twos;
        int[] dp = new int[n + 1];

        dp[0] = 1;
        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];

            }
        }
        return dp[n];
    }
}