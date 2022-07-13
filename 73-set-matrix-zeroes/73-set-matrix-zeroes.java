class Solution {
    
    public class Pair{
        int row ;
        int col;
        
        Pair(int row, int col){
            this.row=row;
            this.col = col;
        }
    }
    public void setZeroes(int[][] matrix) {
        
       ArrayList<Pair> arr = new ArrayList<>();       
     

        
        for(int i =0; i < matrix.length;i++){
           for(int j=0; j<matrix[0].length;j++){
               if(matrix[i][j] ==0){
                   Pair ele = new Pair(i,j);
                   arr.add(ele);
               }
           }  
        }
        
        for(int i=0;i < arr.size();i++){
            int row = arr.get(i).row;
            int col = arr.get(i).col;
            
            for(int c =0;c < matrix[0].length;c++){
                matrix[row][c]=0;
            }
            for(int r =0;r < matrix.length;r++){
                matrix[r][col]=0;
            }
        }
        
       

    }
}