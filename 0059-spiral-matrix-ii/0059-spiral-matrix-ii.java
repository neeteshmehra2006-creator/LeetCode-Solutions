class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int ele = 1;

        int left = 0;
        int top = 0;
        int right = n - 1;
        int down = n - 1;

        while (top <= down && left <= right) {

            for (int j = left; j <= right; j++) {
                arr[top][j] = ele++;
            }
            top++;

            for (int i = top; i <= down; i++) {
                arr[i][right] = ele++;
            }
            right--;

            if (top <= down) {
                for (int j = right; j >= left; j--) {
                    arr[down][j] = ele++;
                }
                down--;
            }

            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    arr[i][left] = ele++;
                }
                left++;
            }
        }

        return arr;
    }
}