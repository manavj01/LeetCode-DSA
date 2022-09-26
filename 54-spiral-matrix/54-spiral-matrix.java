class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;
     
        int rMin = 0;
        int cMin = 0;
        int rMax = n - 1;
        int cMax = m - 1;
        
        while (res.size() < (m * n)) {
            if (cMin > cMax) break;
            for (int j = cMin; j <= cMax; j++) {
                res.add(matrix[rMin][j]);
                
            }
            rMin++;
            if (rMin > rMax) break;
            for (int i = rMin; i <= rMax; i++) {
                res.add(matrix[i][cMax]);
              
            }
            cMax--;
            if (cMin > cMax) break;
            for (int j = cMax; j >= cMin; j--) {
                res.add(matrix[rMax][j]);
                
            }
            rMax--;
            if (rMin > rMax) break;
            for (int i = rMax; i >= rMin; i--) {
                res.add(matrix[i][cMin]);
                
            }

            cMin++;
        }

        return res;
    }
}
