class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] c : board) Arrays.fill(c, '.');
        int[] left = new int[n];
        int[] upperDiagonal = new int[2*n-1];        
        int[] lowerDiagonal = new int[2*n-1];
        solve(res, board,left,upperDiagonal, lowerDiagonal ,0, n);
        return res;
    }
    
    public void solve(List<List<String>> res,char[][] board,int[] left,int[] upperDiagonal,int[] lowerDiagonal, int col, int n ){
        if(col == n){
            res.add(construct(board));
            return;
        }
        
        for(int row =0; row <n ; ++row){
            if(left[row] == 0 && lowerDiagonal[row+col] == 0 && upperDiagonal[n-1 + col - row] == 0){
                left[row] = 1;
                lowerDiagonal[row+col] =1;
                upperDiagonal[n-1 + col - row] = 1;
                board[row][col] = 'Q';
                solve(res,board,left,upperDiagonal,lowerDiagonal,col+1,  n);
                board[row][col] = '.';
                left[row] =0;
                lowerDiagonal[row+col] = 0;
                upperDiagonal[n-1+col-row] =0;
            }
        }
    }

  

    public List<String> construct(char[][] board) {
         List<String> res = new ArrayList<>();
        for (char[] c : board) {
            String s = new String(c);
            res.add(s);
        }
        return res;
    }
}