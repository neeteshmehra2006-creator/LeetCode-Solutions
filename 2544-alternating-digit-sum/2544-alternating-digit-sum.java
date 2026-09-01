class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;
        int dummy = 0;

        while (n != 0) {
            dummy = dummy * 10 + n % 10;
            n = n / 10;
        }

        n = dummy;

        while (n != 0) {
            int rem = n % 10;
            sum = sum + sign * rem;
            sign = sign * -1;
            n = n / 10;
        }
        return sum;
    }
}