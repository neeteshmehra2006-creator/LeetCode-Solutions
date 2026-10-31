class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;

        int arr[] = nums.clone();
        Arrays.sort(arr);

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                j = i + 1;
                break;
            }
        }

        int res[] = new int[n];
        int k = 0;

        for (int i = j; i < n; i++) {
            res[k] = nums[i];
            k++;
        }

        for (int i = 0; i < j; i++) {
            res[k] = nums[i];
            k++;
        }

        return Arrays.equals(res, arr);
    }
}