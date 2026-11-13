class Solution {
    public int thirdMax(int[] nums) {
  
    Arrays.sort(nums);
    int n = nums.length;
    Set<Integer>set = new HashSet<>();
    for(int i = n-1; i>=0; i--){
        set.add(nums[i]);

        if(set.size()==3){
            return nums[i];
        }
    }
     return nums[n-1];
  }
}
