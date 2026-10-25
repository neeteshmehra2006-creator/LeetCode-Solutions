class Solution {
    public void solve(char[][] grid, int row, List<List<String>> ans) {
        int n = grid.length;

        //base case
        if (row == n) {
            //fill the ans list
            List<String> curr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = "";
                for (int j = 0; j < n; j++) {
                    str = str + grid[i][j];
                }
                curr.add(str);
            }
            ans.add(curr);
            return;
            //grid ko fill kar do .(invalid pos) and Q (valid pos)
        }
        for (int j = 0; j < n; j++) {
            //empty hai ya nahi
            if (grid[row][j] == '.') {
                if (isSafe(grid, row, j) == true) {
                    grid[row][j] = 'Q'; //select
                    solve(grid, row + 1, ans); //recursion
                    grid[row][j] = '.';//backtracking
                }
            }
        }
    }

    public boolean isSafe(char[][] grid, int row, int col) {
        int n = grid.length;

        //in col
        for (int j = 0; j < n; j++) {
            if (grid[row][j] == 'Q')
                return false;
        }

        //in row
        for (int i = 0; i < n; i++) {
            if (grid[i][col] == 'Q')
                return false;
        }

        //north east
        int i = row;
        int j = col;

        while (i >= 0 && j < n) {
            if (grid[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        //north west
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (grid[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        //south west
        i = row;
        j = col;
        while (i < n && j < n) {
            if (grid[i][j] == 'Q')
                return false;
            i++;
            j++;
        }
        // south east
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (grid[i][j] == 'Q')
                return false;
            i++;
            j--;
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] grid = new char[n][n];
        // fill all the place with .
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }
        //create new arraylist for ans
        List<List<String>> ans = new ArrayList<>();
        solve(grid, 0, ans);
        return ans;
    }
}
