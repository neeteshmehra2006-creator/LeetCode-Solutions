class Solution {
  public void solve(char grid[][], int row, List<List<String>> ans) {
        int n = grid.length;
        if (row == n) {
            ArrayList<String> curr = new ArrayList<>();

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
            if (grid[row][j] == '.') {
                if (isSafe(grid, row, j)) {
                    grid[row][j] = 'Q'; //Queen is Placed
                    solve(grid, row + 1, ans); //Recursion
                    grid[row][j] = '.'; //BackTraking
                }
            }
        }
    }
    public boolean isSafe(char grid[][], int row, int col) {
        int n = grid.length;
        //Row
        for (int i = 0; i < n; i++) {
            if (grid[i][col] == 'Q') {
                return false;
            }
        }
        //Column
        for (int j = 0; j < n; j++) {
            if (grid[row][j] == 'Q') {
                return false;
            }
        }
        //North East
        int i = row;
        int j = col;

        while (i >= 0 && j < n) {
            if (grid[i][j] == 'Q')return false;
            i--;
            j++;
        }

        //SouthEast

        i = row;
        j = col;

        while (i < n && j < n) {
            if (grid[i][j] == 'Q')return false;
            i++;
            j++;
        }
        //South West
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (grid[i][j] == 'Q')return false;
            i++;
            j--;
        }
        //North West
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (grid[i][j] == 'Q')return false;
            i--;
            j--;
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
     List<List<String>>ans = new ArrayList<>();
     char grid[][] = new char[n][n];
     for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            grid[i][j] = '.';
        }
     }
     solve(grid,0,ans);
     return ans;
    }
}