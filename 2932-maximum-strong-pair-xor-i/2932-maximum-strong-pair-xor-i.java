class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = nums[i];
                int y = nums[j];

                if (Math.abs(x - y) <= Math.min(x, y)) {
                    int xor = x ^ y;
                    if (count < xor) {
                        count = xor;
                    }
                }
            }
        }
        return count;
    }
}