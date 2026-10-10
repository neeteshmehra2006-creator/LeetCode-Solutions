class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for (char x : word1.toCharArray()) {
            set.add(x);
        }
        for (char x : word2.toCharArray()) {
            set.add(x);
        }
        for (char ch : set) {
            int c1 = 0;
            int c2 = 0;

            for (char x : word1.toCharArray()) {
                if (x == ch) {
                    c1++;
                }
            }
            for (char x : word2.toCharArray()) {
                if (x == ch) {
                    c2++;
                }
            }
            if (Math.abs(c1 - c2) > 3) {
                return false;
            }
        }
        return true;
    }
}