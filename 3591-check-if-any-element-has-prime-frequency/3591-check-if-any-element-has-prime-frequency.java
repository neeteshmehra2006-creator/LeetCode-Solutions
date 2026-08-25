class Solution {

    public boolean isprime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int Freq(int i, int nums[]) {
        int F = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                F++;
            }
        }
        return F;
    }

    public boolean checkPrimeFrequency(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int ele = Freq(i, nums);
             if(isprime(ele)){
                return true;
            }
        }
        return false;
    }
}