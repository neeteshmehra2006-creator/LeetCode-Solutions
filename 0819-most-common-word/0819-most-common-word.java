class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();

        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split("[^a-z]+");

        for (int i = 0; i < words.length; i++) {
            if (Arrays.asList(banned).contains(words[i])) {
                continue;
            }

            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        String ans = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}