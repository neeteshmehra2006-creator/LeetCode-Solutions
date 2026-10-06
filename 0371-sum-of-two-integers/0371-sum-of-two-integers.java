class Solution {
    public int getSum(int a, int b) {

        while (b != 0) {

            int carry = (a & b) * 2;

            a = a ^ b;

            b = carry;
        }

        return a;
    }
}