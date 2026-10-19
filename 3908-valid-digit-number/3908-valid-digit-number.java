class Solution {

    public int DigitCount(int x) {
        int dc = 0;
        while (x != 0) {
            dc++;
            x = x / 10;
        }
        return dc;
    }

    public boolean validDigit(int n, int x) {
        int count = DigitCount(n);
        boolean found = false;

        while (n > 9) {
            int rem = n % 10;

            if (rem == x) {
                found = true;
            }

            n = n / 10;
        }

        return found && n != x;
    }
}