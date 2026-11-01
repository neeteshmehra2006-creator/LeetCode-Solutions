class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int sum = nums[low] + nums[high];

            if (sum == 0) {
                return nums[high];
            }
            else if (sum > 0) {
                high--;
            }
            else {
                low++;
            }
        }
        return -1;
    }
}