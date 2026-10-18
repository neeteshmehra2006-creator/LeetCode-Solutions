class Solution {

    public int isFill(int arr[][], int i, int j) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int k = 0; k < n; k++) {
            max = Math.max(max, arr[k][j]);
        }

        return max;
    }

    public int[][] modifiedMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = isFill(matrix, i, j);
                }
            }
        }

        return matrix;
    }
}
