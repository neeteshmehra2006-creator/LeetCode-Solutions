class Solution {
    public String makeFancyString(String s) {
        char ch[] = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || ch[i] != ch[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            if (count < 3) {
                ans.append(ch[i]);
            }
        }
        return ans.toString();
    }
}