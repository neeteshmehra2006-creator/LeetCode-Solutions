class Solution {

    int count = 0; // count variable

    public void solve(char grid[][], int row) {
        int n = grid.length;

        // Base case
        if (row == n) {
            count++; //count valid solution
            return;
        }

        for (int j = 0; j < n; j++) {
            if (grid[row][j] == '.') {
                if (isSafe(grid, row, j)) {
                    grid[row][j] = 'Q';
                    solve(grid, row + 1);
                    grid[row][j] = '.'; // Backtracking
                }
            }
        }
    }

    public boolean isSafe(char grid[][], int row, int col) {
        int n = grid.length;

        // Check column
        for (int i = 0; i < n; i++) {
            if (grid[i][col] == 'Q')
                return false;
        }

        // North East
        int i = row;
        int j = col;

        while (i >= 0 && j < n) { 
            if (grid[i][j] == 'Q')
                return false;
            i--;
            j++;
        }

        // North West
        i = row;
        j = col;

        while (i >= 0 && j >= 0) {
            if (grid[i][j] == 'Q')
                return false;
            i--;
            j--;
        }

        return true;
    }

    public int totalNQueens(int n) {

        char grid[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }

        solve(grid, 0);
        return count;  
    }
}
