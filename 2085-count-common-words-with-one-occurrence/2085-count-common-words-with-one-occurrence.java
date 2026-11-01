class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();

        for (String s : words1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : words2) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        int count = 0;

        for (String str : map.keySet()) {

            if (map.containsKey(str) && map1.containsKey(str)) {
                if (map.get(str) == 1 && map1.get(str) == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}