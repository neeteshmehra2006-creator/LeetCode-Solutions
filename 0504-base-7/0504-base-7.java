class Solution {
    public String convertToBase7(int num) {

        if (num == 0) return "0";

        boolean neg = num < 0;
        num = Math.abs(num);

        String res = "";

        while (num != 0) {
            int bit = num % 7;
            res = bit + res;
            num = num / 7;
        }

        if (neg) res = "-" + res;

        return res;
    }
}