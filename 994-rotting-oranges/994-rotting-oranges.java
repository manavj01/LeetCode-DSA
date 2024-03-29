class Solution {

    public class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int t = 0;

        LinkedList<Pair> que = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2 ) {
   
                  que.add(new Pair(i,j));
                }
            }
        }
        
        return solve(grid,que);
    }

    public int solve(int[][] grid,LinkedList<Pair> que) {
        
       
        int n = grid.length;
        int m = grid[0].length;
       
        int t = 0;
       
        while (!que.isEmpty()) {
            int size = que.size();
            for (int s = 0; s < size; s++) {
                Pair p = que.removeFirst();
                int r = p.x;
                int c = p.y;
                if (r + 1 < n && grid[r + 1][c] == 1) { // down
                    que.addLast(new Pair(r + 1, c));
                    grid[r + 1][c] = 2;
                }
                if (c + 1 < m && grid[r][c + 1] == 1) { // right
                    que.add(new Pair(r, c + 1));
                    grid[r][c + 1] = 2;

                }
                if (r - 1 >= 0 && grid[r - 1][c] == 1) { // up
                    que.add(new Pair(r - 1, c));

                    grid[r - 1][c] = 2;
                }
                if (c - 1 >= 0 && grid[r][c - 1] == 1) { // left
                    que.add(new Pair(r, c - 1));
                    grid[r][c - 1] = 2;
                }
            }
            t++;
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               if(grid[i][j] == 1) return -1; 
            }
        }
        return Math.max(t-1,0);
    }
}
