class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;
        int tot = n * m;
        int c = 0;
        int rMin = 0;
        int cMin = 0;
        int rMax = n - 1;
        int cMax = m - 1;
        
        while (res.size() < (m * n)) {
            if (cMin > cMax) break;
            for (int j = cMin; j <= cMax; j++) {
                res.add(matrix[rMin][j]);
                // c++;
            }
            rMin++;
            if (rMin > rMax) break;
            for (int i = rMin; i <= rMax; i++) {
                res.add(matrix[i][cMax]);
                // c++;
            }
            cMax--;
            if (cMin > cMax) break;
            for (int j = cMax; j >= cMin; j--) {
                res.add(matrix[rMax][j]);
                // c++;
            }
            rMax--;
            if (rMin > rMax) break;
            for (int i = rMax; i >= rMin; i--) {
                res.add(matrix[i][cMin]);
                // c++;
            }

            cMin++;
        }

        return res;
    }
}
