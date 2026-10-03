class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int ele = nums[i];
            int ans = target - ele;
            if(map.containsKey(ans)){
                return new int[]{map.get(ans),i};
            }
            map.put(ele,i);
    }
    return new int[]{};
}
}