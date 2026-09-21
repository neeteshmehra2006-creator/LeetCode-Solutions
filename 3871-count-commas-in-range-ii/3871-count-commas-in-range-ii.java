 class Solution {
    public long countCommas(long n) {
        long comma = 0;

        for (long min = 1000; min <= n; ) {
            comma += (n - min + 1);

            if (min > Long.MAX_VALUE / 1000) {
                break;
            }

            min *= 1000;
        }

        return comma;
    }
}