class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;        
        int m = grid[0].length;
        int c =0;
        for(int i=0; i<n ; i++ ){
            for(int j =0; j<m ; j++){
                if(grid[i][j] == '1'){
                   drownBitch(grid,i,j,n,m);
                    c++;
                }
            }
        }
        return c;
    }
    
    public void drownBitch(char[][] grid, int i, int j , int n, int m ){
        if(i<0 || j < 0 || i==n || j == m || grid[i][j] == '0'){
            return;
        }
        
        grid[i][j] = '0';
        drownBitch(grid,i-1,j,n,m);        
        drownBitch(grid,i,j+1,n,m);
        drownBitch(grid,i+1,j,n,m);
        drownBitch(grid,i,j-1,n,m);

    }
}