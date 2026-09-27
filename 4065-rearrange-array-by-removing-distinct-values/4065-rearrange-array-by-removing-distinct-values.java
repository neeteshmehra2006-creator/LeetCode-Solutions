class Solution {
    public int[] rearrangeArray(int[] nums) {
     TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!map.isEmpty()) {
            ArrayList<Integer> remove = new ArrayList<>();
            for (int x : map.keySet()) {
                ans.add(x);
                map.put(x, map.get(x) - 1);
                if (map.get(x) == 0) {
                    remove.add(x);
                }
            }
            for (int x : remove) {
                map.remove(x);
            }
        }
        int res[]= new int[ans.size()];
        int k = 0;

        for(int i = 0; i<ans.size(); i++){
            res[k] = ans.get(i);
            k++;
        }
        return res;
    }
}