class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 0;
        int max = 0;

        int i = 0;

        //For Second Loop
        int s = k;

        while (k != 0) {
            min = min + nums[i];
            i++;
            k--;
        }
        i = nums.length - 1;

        while (s != 0) {
            max = max + nums[i];
            i--;
            s--;
        }

        return Math.abs(min - max);
    }
}