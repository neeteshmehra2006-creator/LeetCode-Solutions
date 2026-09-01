class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[] = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[j] = nums[i];
                j = j + 2;
            }
        }

        j = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                ans[j] = nums[i];
                j = j + 2;
            }
        }
        return ans;
    }
}