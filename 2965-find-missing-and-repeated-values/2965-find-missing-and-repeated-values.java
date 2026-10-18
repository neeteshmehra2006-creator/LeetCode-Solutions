class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = grid.length;

        for (int arr[] : grid) {
            for (int x : arr) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        int ans[] = new int[2];

        for (int x : map.keySet()) {
            if (map.get(x) > 1) {
                ans[0] = x;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (!map.containsKey(i)) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}