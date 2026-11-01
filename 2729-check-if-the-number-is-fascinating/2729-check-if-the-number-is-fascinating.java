class Solution {

    public int isMerge(int x, int y) {
        int rev = 0;
        while (y != 0) {
            rev = rev * 10 + y % 10;
            y = y / 10;
        }
        while (rev != 0) {
            int ld = rev % 10;
            x = x * 10 + ld;
            rev = rev / 10;
        }
        return x;
    }

    public boolean isCheck(int x) {
        Set<Integer> set = new HashSet<>();

        while (x != 0) {
            int rem = x % 10;

            if (set.contains(rem))
                return false;

            set.add(rem);
            x = x / 10;
        }

        for (int i = 1; i <= 9; i++) {
            if (!set.contains(i))
                return false;
        }
        return true;
    }

    public boolean isFascinating(int n) {
        int num = n;
        int dummy = n;

        int dg = isMerge(num, 2 * dummy);
        int dg1 = isMerge(dg, 3 * dummy);

        int Number = dg1;

        if (isCheck(Number))return true;

        else return false;
    }
}