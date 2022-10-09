class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length];
        for(int[] a : dp) Arrays.fill(a,-1);
        
        int ans = solve(amount, coins, coins.length-1,dp);
        return  ans;
    }
    public int solve(int amt , int[] coins , int idx, int[][] dp){
         if(amt == 0){
             return 1;
         }
        if(idx <0) return 0;
       
        if(dp[amt][idx] != -1) return dp[amt][idx];
       
        int pick = 0;
       
        if(amt-coins[idx] >= 0){
            pick = solve(amt-coins[idx], coins, idx, dp) ; 
        }
        int unpick = solve(amt, coins, idx-1, dp);
        
        return dp[amt][idx] = unpick+pick;
    }
}