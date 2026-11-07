class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans = "";
        int n = words.size();

        for (int i = 0; i < n; i++) {
            String word = words.get(i);
            ans = ans + word.charAt(0);
        }
        return s.equals(ans);
    }
}