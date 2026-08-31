class Solution {

    public int isCount(int n) {
        int di = 0;

        while (n != 0) {
            di++;
            n = n / 10;
        }

        return di;
    }

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {

            int n = i;
            int digit = isCount(n);

            if (digit % 2 == 0) {

                int half = digit / 2;

                int right = 0;
                int left = 0;

                for (int j = 0; j < half; j++) {
                    right = right + n % 10;
                    n = n / 10;
                }

                for (int j = 0; j < half; j++) {
                    left = left + n % 10;
                    n = n / 10;
                }

                if (left == right) {
                    count++;
                }
            }
        }

        return count;
    }
}