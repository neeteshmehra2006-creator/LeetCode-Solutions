class Solution {
    public int getLeastFrequentDigit(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        while (n != 0) {
            int rem = n % 10;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
            n = n / 10;
        }

        int ans = 10;
        int min = Integer.MAX_VALUE;

        for (int key : map.keySet()) {

            if (map.get(key) < min) {
                min = map.get(key);
                ans = key;
            }
            else if (map.get(key) == min) {
                ans = Math.min(ans, key);
            }
        }

        return ans;
    }
}