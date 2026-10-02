class Solution {
    public int maxProductDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        // Find max and min
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int maxCount = 0;
        int minCount = 0;

        // Find second max and second min
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == max) {
                maxCount++;
            } else {
                max2 = Math.max(max2, nums[i]);
            }

            if (nums[i] == min) {
                minCount++;
            } else {
                min2 = Math.min(min2, nums[i]);
            }
        }
        // Duplicate max/min available
        if (maxCount >= 2) {
            max2 = max;
        }
        if (minCount >= 2) {
            min2 = min;
        }
        return (max * max2) - (min * min2);
    }
}