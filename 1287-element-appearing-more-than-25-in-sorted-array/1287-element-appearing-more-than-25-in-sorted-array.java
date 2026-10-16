class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 4) {
                return key;
            }
        }
        return -1;
    }
}