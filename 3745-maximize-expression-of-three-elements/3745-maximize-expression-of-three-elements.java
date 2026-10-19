class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n - 2] + nums[n - 1] - nums[0];
        return ans;
    }
}