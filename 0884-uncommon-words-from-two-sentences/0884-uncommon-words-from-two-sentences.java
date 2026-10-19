class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String x : (s1 + " " + s2).split(" ")) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        ArrayList<String> li = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                li.add(key);
            }
        }

        String arr[] = new String[li.size()];

        for (int i = 0; i < li.size(); i++) {
            arr[i] = li.get(i);
        }

        return arr;
    }
}
