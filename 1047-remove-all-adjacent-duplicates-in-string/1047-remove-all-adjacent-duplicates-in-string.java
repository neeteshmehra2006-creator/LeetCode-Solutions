class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        while (st.size() != 0) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}