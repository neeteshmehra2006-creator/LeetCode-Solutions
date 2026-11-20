class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (char key : map.keySet()) {
            int freq = map.get(key);

            if (freq % 2 != 0) {
                max = Math.max(max, freq);
            } else {
                min = Math.min(min, freq);
            }
        }

        return max - min;
    }
}
