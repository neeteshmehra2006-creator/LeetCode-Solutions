class Solution {

    public int isNextG(int x, int nums[], int j) {

        for (int i = j + 1; i < j + nums.length; i++) {

            if (nums[i % nums.length] > x) {
                return nums[i % nums.length];
            }
        }

        return -1;
    }

    public int[] nextGreaterElements(int[] nums) {

        int arr[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int x =  isNextG(nums[i], nums, i);
            arr[i] = x;
        }

        return arr;
    }
}