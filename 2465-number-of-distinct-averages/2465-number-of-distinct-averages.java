class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        HashSet<Double> set = new HashSet<>();

        while (low < high) {
            double avg = (nums[low] + nums[high]) / 2.0;

            set.add(avg);

            low++;
            high--;
        }

        return set.size();
    }
}