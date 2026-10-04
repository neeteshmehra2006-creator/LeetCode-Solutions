class Solution {

    public int Ans(int x, int y) {
        if (x % y == 0) {
            return y;
        }
        return -1;
    }

    public int isSum(int x) {
        int s = 0;
        while (x != 0) {
            s = s + x % 10;
            x = x / 10;
        }
        return s;
    }

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int dummy = x;

        int sum = isSum(x);

        return Ans(dummy, sum);
    }
}