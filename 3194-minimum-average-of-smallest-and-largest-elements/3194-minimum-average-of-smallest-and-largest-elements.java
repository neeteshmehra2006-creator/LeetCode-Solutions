class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;
        double ans = Double.MAX_VALUE;

        while (low < high) {
            double avg = (nums[low] + nums[high]) / 2.0;

            ans = Math.min(ans, avg);

            low++;
            high--;
        }

        return ans;
    }
}