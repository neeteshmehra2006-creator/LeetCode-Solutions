class Solution {
    public int sumOfUnique(int[] nums) {
    HashMap<Integer,Integer>map = new HashMap<>();
    int sum = 0;

    for(int x : nums){
        map.put(x,map.getOrDefault(x,0)+1);
    } 

    for(int key : map.keySet()){
        if(map.get(key)==1){
            sum = sum+key;
        }
    }
    return sum;
    }
}