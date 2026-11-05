class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> li = new ArrayList<>();
        int n = nums.length;
        int rem = 0;

        for (int i = 0; i < n; i++) {

            rem = (rem * 2 + nums[i]) % 5;

            if (rem == 0)
                li.add(true);
            else
                li.add(false);
        }
        return li;
    }
}