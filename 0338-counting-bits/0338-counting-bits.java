class Solution {

    public int isCount(long dg) {
        int count = 0;

        while (dg != 0) {
            long rem = dg % 10;

            if (rem == 1) {
                count++;
            }

            dg = dg / 10;
        }

        return count;
    }

    public int isBinaryCount(int x) {
        long bit = 0;

        while (x != 0) {
            int ld = x % 2;
            bit = bit * 10 + ld;
            x = x / 2;
        }

        int count = isCount(bit);
        return count;
    }

    public int[] countBits(int n) {
        int arr[] = new int[n + 1];
        int j = 0;

        for (int i = 0; i <= n; i++) {
            int bit = isBinaryCount(i);
            arr[j] = bit;
            j++;
        }

        return arr;
    }
}