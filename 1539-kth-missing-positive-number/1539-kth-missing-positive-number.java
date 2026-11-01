class Solution {
    public int findKthPositive(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        Set<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        int count = 0;

        for (int i = 1; i <= max + k; i++) {
            if (!set.contains(i)) {
                count++;
            }
            if (count == k) {
                return i;
            }
        }
        return -1;
    }
}