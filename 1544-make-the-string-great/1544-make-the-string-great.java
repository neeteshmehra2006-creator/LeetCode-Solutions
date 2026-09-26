class Solution {
    public String makeGood(String s) {
        char[] ch = s.toCharArray();
        String ans = "";

        for(char x : ch) {

            if(ans.length() > 0) {
                char last = ans.charAt(ans.length() - 1);

                if(last + 32 == x || last - 32 == x) {
                    ans = ans.substring(0, ans.length() - 1);
                    continue;
                }
            }

            ans = ans + x;
        }

        return ans;
    }
}