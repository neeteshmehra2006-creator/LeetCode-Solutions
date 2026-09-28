class Solution {
    public String reversePrefix(String word, char ch) {

        Stack<Character> st = new Stack<>();

        int i;

        for (i = 0; i < word.length(); i++) {

            st.push(word.charAt(i));

            if (word.charAt(i) == ch) {
                break;
            }
        }
 
        if (i == word.length()) {
            return word;
        }

        String ans = "";

        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }

        for (int j = i + 1; j < word.length(); j++) {
            ans = ans + word.charAt(j);
        }

        return ans;
    }
}