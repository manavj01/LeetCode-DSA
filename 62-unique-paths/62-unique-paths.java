class Solution {
    public  int uniquePaths(int n, int m){
       int[][] dp = new int[n][m];
        for (int[] a : dp){
            Arrays.fill(a,-1);
        }

        return uniquePathsHelper(0, 0, n, m, dp);
    }
   public  int uniquePathsHelper(int i, int j, int n, int m, int[][] dp) {
        if (i == (n - 1) && j == (m - 1)) {
            return 1;
        }

        if (i >= n || j >= m) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        } else {
            return dp[i][j] = uniquePathsHelper(i + 1, j, n, m, dp) + uniquePathsHelper(i, j + 1, n, m, dp);
        }
    }
}