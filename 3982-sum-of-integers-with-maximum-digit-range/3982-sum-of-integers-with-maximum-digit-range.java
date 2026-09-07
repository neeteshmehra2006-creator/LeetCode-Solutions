class Solution {

    public int DigR(int x) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (x != 0) {
            int rem = x % 10;

            min = Math.min(min, rem);
            max = Math.max(max, rem);

            x = x / 10;
        }

        return max - min;
    }

    public int maxDigitRange(int[] nums) {

        int maxRange = 0;
        for (int i = 0; i < nums.length; i++) {
            int dummy = DigR(nums[i]);
            maxRange = Math.max(maxRange,dummy);
        }

        int ans = 0;
 
        for (int i = 0; i < nums.length; i++) {
            int dummy = DigR(nums[i]);
            if ( dummy == maxRange) {
                ans = ans+nums[i];
            }
        }

        return ans;
    }
}