class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int arr[][] = new int[r][c];
        int o = 0;
        int p = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                arr[o][p] = mat[i][j];
                p++;

                if (p == c) {
                    p = 0;
                    o++;
                }
            }
        }
        return arr;
    }
}