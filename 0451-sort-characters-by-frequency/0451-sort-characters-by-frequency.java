class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        String ans = "";

        while (!map.isEmpty()) {

            char maxChar = ' ';
            int max = 0;

            for (char x : map.keySet()) {
                if (map.get(x) > max) {
                    max = map.get(x);
                    maxChar = x;
                }
            }

            for (int i = 0; i < max; i++) {
                ans += maxChar;
            }

            map.remove(maxChar);
        }

        return ans;
    }
}