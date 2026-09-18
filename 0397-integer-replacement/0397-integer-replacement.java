class Solution {
    public int integerReplacement(int num) {
        int count = 0;
        long n = num;

        if (n == 1)
            return 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                if (n == 3 || n % 4 == 1) {
                    n--;
                } else {
                    n++;
                }
            }
            count++;
        }
       return count;
    }
}