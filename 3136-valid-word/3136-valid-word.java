class Solution {

    public boolean isNumber(char x) {
        return x >= '0' && x <= '9';
    }

    public boolean isVowel(char x) {
        return x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||
               x=='A'||x=='E'||x=='I'||x=='O'||x=='U';
    }

    public boolean isConsonant(char x) {
        return (x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z')
                && !isVowel(x);
    }

    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        int n = 0;
        int v = 0;
        int c = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (isNumber(ch)) {
                n++;
            } else if (isVowel(ch)) {
                v++;
            } else if (isConsonant(ch)) {
                c++;
            } else {
                return false;
            }
        }

        return v > 0 && c > 0;
    }
}