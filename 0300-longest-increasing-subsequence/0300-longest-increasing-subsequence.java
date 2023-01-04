class Solution {

    public int lengthOfLIS(int[] nums) {
        // int[][] dp = new int[nums.length + 1][nums.length + 1];
        int[] dp = new int[nums.length + 1];

        // for (int[] d : dp) Arrays.fill(d, -1);
        Arrays.fill(dp, -1);
        // System.out.println(Arrays.toString(dp));
        int bestAns = 0;
        for(int i=0; i<nums.length; i++){
            bestAns = Math.max(bestAns,solve(nums,dp,nums.length,i));
        }
        return bestAns;
        
    }

    public int solve(int[] nums, int[] dp, int n, int idx) {
        if (idx == n) {
            return 0;
        }

        int best = 0;
        if(dp[idx] != -1) return dp[idx];
        for (int i = idx + 1; i < n; i++) {
            
            if (nums[idx] < nums[i]) {
                best = Math.max(best,  solve(nums, dp, n, i));
            }
        }

        return dp[idx] =  best+1 ;
    }

    public int solve2(int[] nums, int[][] dp, int n, int idx, int prev) {
        if (idx == n) {
            return 0;
        }

        if (dp[idx][prev + 1] != -1) return dp[idx][prev + 1];
        int length = solve2(nums, dp, n, idx + 1, prev);

        if (prev == -1 || nums[idx] > nums[prev]) {
            length = Math.max(length, 1 + solve2(nums, dp, n, idx + 1, idx));
        }

        return dp[idx][prev + 1] = length;
    }
}
