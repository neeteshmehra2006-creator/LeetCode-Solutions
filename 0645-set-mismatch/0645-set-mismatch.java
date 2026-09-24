class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    arr[0] = nums[i];
                }
            }
        }

        int ans = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        arr[1] = ans - (sum - arr[0]);

        return arr;
    }
}