class Solution {
    public boolean isDigit(char x) {
        if (x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' ||
                x == '7' || x == '8' || x == '9' || x == '0') {
            return true;
        } else {
            return false;
        }
    }

    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (isDigit(s.charAt(i))) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        String ans = "";

        while (st.size() != 0) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}