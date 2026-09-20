class Solution {
    public int reverseDegree(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int k = i + 1;

            int RevA = 26 - (c - 'a');

            ans = ans + RevA * k;

        }
        return ans;
    }
}