class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] c : board) Arrays.fill(c, '.');
        solve1(res, board, 0, n);
        return res;
    }

    public void solve1(List<List<String>> res, char[][] board, int col, int n) {
        if (col == n) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isQueenSafe(row, col, n, board)) {
                board[row][col] = 'Q';
                solve1(res, board, col + 1, n);
                board[row][col] = '.';
            }
        }
    }

    public boolean isQueenSafe(int row, int col, int n, char[][] board) {

        int dRow = row;
        int dCol = col;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dRow;
        col = dCol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;

            col--;
        }
//        row = dRow;
        col = dCol;
        while (row < n && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
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