class Solution {
    public int maxProductDifference(int[] nums) {
      Arrays.sort(nums);
      int n = nums.length;
      int pro = nums[n-1]*nums[n-2];
      int pro1 = nums[0]*nums[1];
      return pro-pro1;
    }
}