class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
       int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for(int i=0; i < n; i++){
            for(int j =0; j < m;j++){
                if(arr[i][j] != 1){
                    dp[i][j] =-1;
                }else{
                    dp[i][j] = -2;
                }
            }
        }
        if(arr[n-1][m-1] == 1){
            return 0;
        }

        return uniquePaths3Helper(0, 0, n, m, dp);
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