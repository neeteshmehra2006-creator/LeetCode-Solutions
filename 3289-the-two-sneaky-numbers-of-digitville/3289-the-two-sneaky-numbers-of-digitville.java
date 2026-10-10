class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int arr[] = new int[2];
        int j = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                arr[j] = key;
                j++;
            }
        }
        return arr;
    }
}