class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int res[] = new int[2];
        int row = mat.length;
        int col = mat[0].length;
        int maxI = 0;
        int maxone = 0;

        for (int i = 0; i < row; i++) {
            int countone = 0;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    countone++;
                }
            }
            if (countone > maxone) {
                maxone = countone;
                maxI = i;
            }
        }
        res[0] = maxI;
        res[1] = maxone;
        return res;
    }
}