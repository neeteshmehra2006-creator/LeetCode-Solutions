class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int fi = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                fi = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        //mereko fi mil gya
        int li = -1;
        low = 0;
        high = n-1;;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                li = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        // dono mil gya
        int[] arr = new int[2];
        arr[0] = fi;
        arr[1] = li;
        return arr;
    }
}