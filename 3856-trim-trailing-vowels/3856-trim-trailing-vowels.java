class Solution {
    public static boolean isVowel(char x) {
        return x=='a'||x=='e'||x=='i'||x=='o'||x=='u';
    }

    public String trimTrailingVowels(String s) {

        String sh = "";

        int i = s.length() - 1;

        while(i >= 0 && isVowel(s.charAt(i))) {
            i--;
        }

        for(int j = 0; j <= i; j++) {
            sh = sh + s.charAt(j);
        }

        return sh;
    }
}