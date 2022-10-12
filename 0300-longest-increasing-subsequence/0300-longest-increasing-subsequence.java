class Solution {

    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        for (int[] d : dp) Arrays.fill(d, -1);

        return solve(nums, dp, nums.length, 0, -1);
    }

    public int solve(int[] nums, int[][] dp, int n, int idx, int prev) {
        if (idx == n) {
            return 0;
        }

        if (dp[idx][prev + 1] != -1) return dp[idx][prev + 1];
        int length = solve(nums, dp, n, idx + 1, prev);


        if (prev == -1 || nums[idx] > nums[prev]) {
            length = Math.max(length, 1 + solve(nums, dp, n, idx + 1, idx));
        }

        return dp[idx][prev + 1] = length;
    }
}
