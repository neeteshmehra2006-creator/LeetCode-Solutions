class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int arr[] = new int[col];

        for (int i = 0; i < col; i++) {
            int max = 0;
            for (int j = 0; j < row; j++) {
                int len = String.valueOf(grid[j][i]).length();

                if (max < len) {
                    max = len;
                }
                arr[i] = max;
            }
        }
        return arr;
    }
}