class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char ch[] = s.toCharArray();

        for (char x : ch) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int count = 0;
        char a = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                count++;
            }
        }
        for (char key : map.keySet()) {
            if (map.get(key) != count) {
                return false;
            }
        }
        return true;
    }
}