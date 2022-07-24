class Solution {

      public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 0; i < m ; i++) {
            for (int j = 1; j <=n; j++) {
                if(obstacleGrid[i][j-1] == 1){
                    dp[j] = 0;
                }else {
                    dp[j] += dp[j -1];
                }
            }
        }
        return dp[n];
    }
    
    
     public static int uniquePaths3Helper(int i, int j, int n, int m, int[][] dp) {
        if (i == (n - 1) && j == (m - 1)) {
            return 1;
        }

        if (i >= n || j >= m) {
            return 0;
        }
        if(dp[i][j] == -2){
            return 0;
        }
         
        if (dp[i][j] != -1 ) {
            return dp[i][j];
        } else {
            return dp[i][j] = uniquePaths3Helper(i + 1, j, n, m, dp) + uniquePaths3Helper(i, j + 1, n, m, dp);
        }
    }
}