class Solution {
    public boolean safe(char[][] grid, int col, int row) {
        // check for that column

        for (int j = row; j >=0 ; j--) {
            if (grid[j][col] == 'Q')
                return false;
        }

        // check for upper left diagonal

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j] == 'Q')
                return false;
        }

        // check for upper right diagonal

        for (int i = row, j = col; i >= 0 && j < grid.length; i--, j++) {
            if (grid[i][j] == 'Q') {
                return false;
            }

        }

        return true;
    }

    public static List<String> construct(char[][] board) {

        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;
    }

    public void solver(char[][] grid, List<List<String>> res, int row) {

        if (row == grid.length) {
            res.add(construct(grid));
            return;
        }

        for (int j = 0; j < grid.length; j++) {
            if (safe(grid, j, row)) {
                grid[row][j] = 'Q';
                solver(grid, res, row + 1);
                grid[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }

        solver(grid, res, 0);

        return res;
    }
}