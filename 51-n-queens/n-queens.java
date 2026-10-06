class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(0, board, ans, n);

        return ans;
    }

    void solve(int row, char[][] board, List<List<String>> ans, int n) {

        // All queens placed
        if (row == n) {
            List<String> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }

            ans.add(list);
            return;
        }

        // Try every column
        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, board, n)) {

                board[row][col] = 'Q';

                solve(row + 1, board, ans, n);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    boolean isSafe(int row, int col, char[][] board, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }
}