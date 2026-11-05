class Solution {

    public int isBinary(int n) {
        int bin = 0;
        while (n != 0) {
            int rem = n % 2;
            bin = bin * 10 + rem;
            n = n / 2;
        }
        return bin;
    }

    public boolean isCheck(int n, int k) {
        int count = 0;
        while (n != 0) {
            int rem = n % 10;

            if (rem == 1) {
                count++;
            }
            n = n / 10;
        }

        return k == count;
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            int bin = isBinary(i);
            if (isCheck(bin, k)) {
                sum = sum + nums.get(i);
            }
        }
        return sum;
    }
}