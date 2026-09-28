class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[n - 1];
        int i = 0;
        
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) {
            i++;
        }

        String ans = "";

        for (int j = 0; j < i; j++) {
            ans = ans + a.charAt(j);
        }
        return ans;
    }
}