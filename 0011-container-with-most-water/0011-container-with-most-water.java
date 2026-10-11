class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MIN_VALUE;

        while(low<high){
             int l = high-low;
             int b = Math.min(height[low],height[high]);
             int area = l*b;

             ans = Math.max(area,ans);

            if(height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return ans;
    }
}