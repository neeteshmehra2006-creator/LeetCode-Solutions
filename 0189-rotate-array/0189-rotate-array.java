class Solution {
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    if(n == 0)return;
    k = k % n;
    int p = 0;
    int res[] = new int[n];
    int j = 0;

    for(int i = 0; i<n-k; i++){
        p++;
    }
    for(int i = p; i<n; i++){
        res[j] = nums[i];
        j++;
    }
    for(int i = 0; i<p; i++){
        res[j] = nums[i];
        j++;
    }
    for(int i = 0; i<n; i++){
        nums[i] = res[i];
    }
    }
}