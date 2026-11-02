class Solution {

    public int isSetBit(int x) {
        int bit = 0;

        while (x != 0) {
            int rem = x % 2;

            if (rem == 1) {
                bit++;
            }

            x = x / 2;
        }

        return bit;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int Num = isSetBit(i);

            if (isPrime(Num)) {
                count++;
            }
        }

        return count;
    }
}