class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int sp = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int r = 0;
                int c = 0;

                for (int k = 0; k < row; k++) {
                    if (mat[k][j] == 1) {
                        r++;
                    }
                }

                for (int k = 0; k < col; k++) {
                    if (mat[i][k] == 1) {
                        c++;
                    }
                }

                if (mat[i][j] == 1 && r == 1 && c == 1) {
                    sp++;
                }
            }
        }
        return sp;
    }
}