class Solution {
    public int findGCD(int[] nums) {
    int n = nums.length;
    Arrays.sort(nums);
    int low = nums[0];
    int high = nums[n-1];
    for(int i = low; i>=1; i--){
        if(low % i == 0 && high % i == 0){
            return i;
        }
    }
    return -1;
    }
}