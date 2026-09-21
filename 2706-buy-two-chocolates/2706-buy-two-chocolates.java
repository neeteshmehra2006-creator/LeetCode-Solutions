 class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
        }

        boolean check = false;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min && !check) {
                check = true;
                continue;
            }

            min2 = Math.min(min2, prices[i]);
        }

        int rem = money - (min + min2);

        if (rem >= 0) {
            return rem;
        }

        return money;
    }
}