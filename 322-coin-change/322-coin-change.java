class Solution {

    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[amount + 1][coins.length];
        for (int[] pp : dp) Arrays.fill(pp, -1);
        int ans = solve(coins, amount, coins.length - 1, dp);
        return ans >= (int) 1e8 ? -1 : ans;
    }

    public int solve(int[] coins, int amt, int idx, int[][] dp) {
        if (amt == 0) return 0;

        if (idx < 0) {
            return (int) 1e8;
        }

        int pick = (int) 1e8;
        
        if (dp[amt][idx] != -1) return dp[amt][idx];
            if (amt - coins[idx] >= 0) {
                pick = Math.min(1 + solve(coins, amt - coins[idx], idx, dp), solve(coins, amt , idx - 1, dp));
            }
        
        int unPick = solve(coins, amt, idx - 1, dp);

        return dp[amt][idx] = Math.min(pick, unPick);
    }
}
