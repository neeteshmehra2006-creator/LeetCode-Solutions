class Solution {

    public boolean isVowel(char x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public int maxFreqSum(String s) {
        String V = "";
        String C = "";

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                V = V + s.charAt(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) {
                C = C + s.charAt(i);
            }
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        char ch1[] = V.toCharArray();

        for (char x : ch1) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        char ch2[] = C.toCharArray();

        for (char x : ch2) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        int vmax = 0;

        for (char key : map1.keySet()) {
            vmax = Math.max(vmax, map1.get(key));
        }

        int cmax = 0;

        for (char key : map2.keySet()) {
            cmax = Math.max(cmax, map2.get(key));
        }

        int ans = vmax + cmax;

        return ans;
    }
}