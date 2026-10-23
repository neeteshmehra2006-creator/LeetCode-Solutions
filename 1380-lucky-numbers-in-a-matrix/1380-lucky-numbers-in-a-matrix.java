
class Solution {

    public boolean check(int n, int m, int ele, int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {
            if (arr[n][i] < ele) {
                return false;
            }
        }

        for (int i = 0; i < row; i++) {
            if (arr[i][m] > ele) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> li = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (check(i, j, matrix[i][j], matrix)) {
                    li.add(matrix[i][j]);
                }
            }
        }
        return li;
    }
}
