class Solution {
    public boolean isBalanced(String num) {
        char ch[] = num.toCharArray();
        int esum = 0;
        int osum = 0;

        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                esum = esum + (ch[i] - '0');
            } else {
                osum = osum + (ch[i] - '0');
            }
        }

        return esum == osum;
    }
}