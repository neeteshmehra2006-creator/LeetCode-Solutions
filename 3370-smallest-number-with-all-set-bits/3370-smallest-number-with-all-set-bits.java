class Solution {

    public boolean isSetBit(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                return false;
        }
        return true;
    }

    public boolean isCheck(int x) {
        String s = "";

        while (x != 0) {
            int bit = x % 2;
            s = s + bit;
            x = x / 2;
        }

        return isSetBit(s);
    }

    public int smallestNumber(int n) {

        for (int i = n;; i++) {
            if (isCheck(i)) {
                return i;
            }
        }
    }
}