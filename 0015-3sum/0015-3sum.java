class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

     HashSet<List<Integer>>set = new HashSet<>();
     
     Arrays.sort(nums);

     for(int ele = 0; ele < nums.length-2; ele++){

        int low = ele + 1;
        int high = nums.length-1;

        while(low < high){

            int sum = nums[ele] + nums[low] + nums[high];
            
            if(sum == 0){
             set.add(Arrays.asList(nums[ele],nums[low],nums[high]));
             high--;
             low++;
            }
            else if(sum > 0){
                high--;
            }
            else{
                low++;
            }
        } 
     }
      return new ArrayList<>(set);
    }
}