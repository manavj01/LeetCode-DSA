class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0 ;
        
        for( int i = 0 ; i < mat.length ; i++){
            sum = sum + mat[i][i];
        }
        int j = mat.length-1;
        for(int i = 0 ; i < mat.length; i++){
            sum = sum + mat[i][j];
            j--;
        }
        if(mat.length % 2 == 1){
         sum = sum - mat[mat.length/2][mat.length/2];            
        }
        return sum;
    }
}