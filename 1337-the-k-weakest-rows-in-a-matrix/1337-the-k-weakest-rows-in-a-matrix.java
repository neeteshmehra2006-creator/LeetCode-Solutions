
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;

        int res[] = new int[row];

        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            res[i] = count;
        }

        int idx[] = new int[row];

        for (int i = 0; i < row; i++) {
            idx[i] = i;
        }

        for (int i = 0; i < row - 1; i++) {
            for (int j = i + 1; j < row; j++) {
                if (res[idx[i]] > res[idx[j]] ||
                   (res[idx[i]] == res[idx[j]] && idx[i] > idx[j])) {

                    int temp = idx[i];
                    idx[i] = idx[j];
                    idx[j] = temp;
                }
            }
        }

        int ans[] = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = idx[i];
        }

        return ans;
    }
}
