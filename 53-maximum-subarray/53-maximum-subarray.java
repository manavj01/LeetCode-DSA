class Solution {
    public int maxSubArray(int[] A) {
//         if (nums.length==1) return nums[0];

//         int maxSum = Integer.MIN_VALUE;
//         int sum=0;
//         for (int i =0 ; i < nums.length; i++){
//             sum=sum+ nums[i];
//             maxSum = Math.max(sum,maxSum);
//             if (sum < 0){
//                 sum=0;
//             }
//         }

//         return maxSum;
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
        
    }
}