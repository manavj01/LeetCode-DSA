class Solution {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (solve(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    public boolean solve(char[][] board, String word, int i, int j, int idx) {
        if (idx == word.length()) return true;
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] != word.charAt(idx)) {
            return false;
        }
        board[i][j] ^= 256;
       boolean flag =  solve(board, word, i - 1, j, idx + 1) ||
        solve(board, word, i, j + 1, idx + 1) ||
        solve(board, word, i + 1, j, idx + 1) ||
        solve(board, word, i, j - 1, idx + 1);
        board[i][j] ^= 256;
        
        return flag;
    }
}
