class Solution {

    public void Fill(int[][] arr, int x, int y, int ele) {

        int col = arr[0].length;
        for (int i = 0; i < col; i++) {
            arr[x][i] = 0;
        }
        int row = arr.length;
        for (int i = 0; i < row; i++) {
            arr[i][y] = 0;
        }
    }

    public void setZeroes(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int[][] copy = new int[row][col];

        for (int i = 0; i < row; i++) {
            copy[i] = arr[i].clone();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (copy[i][j] == 0) {
                    Fill(arr, i, j, arr[i][j]);
                }
            }
        }
    }
}