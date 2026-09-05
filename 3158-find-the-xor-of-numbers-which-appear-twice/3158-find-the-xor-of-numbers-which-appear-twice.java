class Solution {
    public int duplicateNumbersXOR(int[] nums) {
    Map<Integer,Integer>map = new HashMap<>();

    for(int x : nums){
        map.put(x,map.getOrDefault(x,0)+1);
    }
    int xor = 0;

    for(int key : map.keySet()){
        if(map.get(key)==2){
            xor = xor ^ key;
        }
    }
    return xor;
    }
}