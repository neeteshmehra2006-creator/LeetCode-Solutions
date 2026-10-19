class Solution {

    public boolean isVowel(char x) {
        return x == 'a' || x == 'e' || x == 'i' ||
               x == 'o' || x == 'u' || x == 'A' ||
               x == 'E' || x == 'I' || x == 'O' || x == 'U';
    }

    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                v++;
            } else if (Character.isLetter(ch)) {
                c++;
            }
        }

        if (c == 0) {
            return 0;
        }

        return v / c;
    }
}