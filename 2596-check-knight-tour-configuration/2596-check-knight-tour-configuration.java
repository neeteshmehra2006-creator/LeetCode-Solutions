class Solution {

    public boolean check(int[][] grid, int row, int col, int x) {
        int n = grid.length;

        // Base Case
        if (x == n * n - 1) return true;

        // 2 up + 1 right
        int i = row - 2;
        int j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == x + 1){
            return check(grid, i, j, x + 1);
        }

        // 2 up + 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == x + 1){
            return check(grid, i, j, x + 1);
        }

        // 2 down + 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == x + 1){
            return check(grid, i, j, x + 1);
        }
        // 2 down + 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == x + 1){
            return check(grid, i, j, x + 1);
        }

        // 2 right + 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == x + 1){
            return check(grid, i, j, x + 1);
        }

        // 2 right + 1 down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == x + 1){
            return check(grid, i, j, x + 1);
        }

        // 2 left + 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == x + 1){
            return check(grid, i, j, x + 1);
        }

        // 2 left + 1 down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == x + 1){
            return check(grid, i, j, x + 1);
        }

        return false;
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;

        return check(grid, 0, 0, 0);
    }
}
