class Solution {

    public void solve(char grid[][], int row, List<List<String>> ans) {
        int n = grid.length;

        // Base Case
        if (row == n) {
            // Fill the ans List
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
        }

        for (int j = 0; j < n; j++) {
            // Empty hai ya nahi aur safe hai ya nahi
            if (grid[row][j] == '.' && safe(grid, row, j)) {
                grid[row][j] = 'Q'; // Select
                solve(grid, row + 1, ans); // Recursive Call
                grid[row][j] = '.'; // Backtracking
            }
        }
    }

    // Safe Function
    public boolean safe(char grid[][], int row, int col) {
        int n = grid.length;

        // In Row
        for (int j = 0; j < n; j++) {
            if (grid[row][j] == 'Q')
                return false;
        }

        // In Column
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

        // South West
        i = row;
        j = col;

        while (i < n && j >= 0) {
            if (grid[i][j] == 'Q')
                return false;
            i++;
            j--;
        }

        // South East
        i = row;
        j = col;

        while (i < n && j < n) {
            if (grid[i][j] == 'Q')
                return false;
            i++;
            j++;
        }

        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        char grid[][] = new char[n][n];

        // Fill all the places with dot
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }

        // Create ArrayList of String
        List<List<String>> ans = new ArrayList<>();

        solve(grid, 0, ans);

        return ans;
    }
}
