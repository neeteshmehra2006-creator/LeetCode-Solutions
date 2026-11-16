class Solution {

    public int isVowel(String ch) {
        int V = 0;
        for (int i = 0; i < ch.length(); i++) {
            char x = ch.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||
                    x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                V++;
            }
        }
        return V;
    }

    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String F = "";
        String S = "";

        for (int i = 0; i < n / 2; i++) {
            F = F + s.charAt(i);
        }
        for (int i = n / 2; i < n; i++) {
            S = S + s.charAt(i);
        }

        int A = isVowel(F);
        int B = isVowel(S);

        return A == B;
    }
}