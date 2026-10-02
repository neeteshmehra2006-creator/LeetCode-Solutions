class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean check = true;

        int i = 0;

        while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
            i++;
        }

        if (i == nums.length - 1) {
            return true;
        }

        if (nums[i] < nums[i + 1]) {

            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    check = false;
                    break;
                }
            }

        } else {

            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    check = false;
                    break;
                }
            }
        }

        return check;
    }
}