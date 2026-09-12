class Solution {

    public boolean Count(int x, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        return count == 3;
    }

    public boolean Ans(int x, int[] nums) {

        int first = -1;
        int gap = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == x) {

                if (first == -1) {
                    first = i;
                }
                else if (gap == -1) {
                    gap = i - first;
                }
                else {
                    return i - first == 2 * gap;
                }
            }
        }

        return false;
    }

    public int countSpecialIntegers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];

            if (Count(x, nums) && Ans(x, nums)) {
                set.add(x);
            }
        }

        return set.size();
    }
}