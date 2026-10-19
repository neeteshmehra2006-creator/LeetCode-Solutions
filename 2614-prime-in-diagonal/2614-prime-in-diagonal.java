class Solution {

    public boolean isPrime(int x) {
        if (x < 2)return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int diagonalPrime(int[][] nums) {

        int max = 0;
        int row = nums.length;
        int high = nums[0].length;

        for (int i = 0; i < row; i++) {
            if (isPrime(nums[i][i])) {
                if (max < nums[i][i]) {
                    max = nums[i][i];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            int ele = nums[i][row - 1 - i];
            if (isPrime(ele)) {
                if (max < ele) {
                    max = ele;
                }
            }
        }

        return max;
    }
}