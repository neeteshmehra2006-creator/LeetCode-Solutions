 class Solution {
    public int buyChoco(int[] prices, int money) {
    Arrays.sort(prices);
    int res = prices[0]+prices[1];
    int ans = money-res;

    if(ans >= 0){
        return ans;
    }
    return money;
    }
}