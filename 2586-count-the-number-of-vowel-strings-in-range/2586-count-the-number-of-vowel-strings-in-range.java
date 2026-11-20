class Solution {

    public boolean isVowel(String s) {
        int n = s.length() - 1;
        char st = s.charAt(0);
        char en = s.charAt(n);

        if (isSafe(st) == false || isSafe(en) == false) {
            return false;
        } else
            return true;
    }

    public boolean isSafe(char x) {
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }

    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            String s = words[i];
            if (isVowel(s)) {
                count++;
            }
        }
        return count;
    }
}