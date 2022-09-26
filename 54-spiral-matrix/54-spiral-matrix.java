class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        int tot = n*m;
        int c=0;
        int rMin =0;
        int cMin =0;
        int rMax = n-1;
        int cMax = m-1;
        while(c<tot){
              if(cMin>cMax) break;
            if(rMin>rMax) break;
            for(int j = cMin; j<=cMax; j++){
                res.add(matrix[rMin][j]);
                c++;
            }
            System.out.println(res);
            rMin++;
              if(cMin>cMax) break;
            if(rMin>rMax) break;
            for(int i=rMin; i<=rMax; i++){
                res.add(matrix[i][cMax]);
                c++;
            }
            System.out.println(res);
            cMax--;
              if(cMin>cMax) break;
            if(rMin>rMax) break;
            for(int j=cMax; j>=cMin; j--){
                res.add(matrix[rMax][j]);
                c++;
            }
                        System.out.println(res);
            rMax--;
              if(cMin>cMax) break;
            if(rMin>rMax) break;
            for(int i=rMax; i>=rMin; i--){
                res.add(matrix[i][cMin]);
                c++;
            }
                        System.out.println(res);

            cMin++;
            if(cMin>cMax) break;
            if(rMin>rMax) break;
        }
        
        
        return res;
    }
}