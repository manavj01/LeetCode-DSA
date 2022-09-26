class Solution {
    public int[][] generateMatrix(int n) {
        int c=0;
        int[][] matrix = new int[n][n];
        
        int rMin = 0;
        int cMin = 0;
        int rMax = n - 1;
        int cMax = n - 1;
        
        while (c < (n * n)) {
            if (cMin > cMax) break;
            for (int j = cMin; j <= cMax; j++) {
                matrix[rMin][j] = ++c;
            }
            rMin++;
            if (rMin > rMax) break;
            for (int i = rMin; i <= rMax; i++) {
                matrix[i][cMax] = ++c;
              
            }
            cMax--;
            if (cMin > cMax) break;
            for (int j = cMax; j >= cMin; j--) {
                matrix[rMax][j] = ++c;
                
            }
            rMax--;
            if (rMin > rMax) break;
            for (int i = rMax; i >= rMin; i--) {
                matrix[i][cMin] = ++c;
            }

            cMin++;
        }

        return matrix;
    }
}