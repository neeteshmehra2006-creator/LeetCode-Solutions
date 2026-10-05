class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String x : sentences) {
            int word = 1;

            char arr[] = x.toCharArray();
            for (char ch : arr) {
                if (ch == ' ') {
                    word++;
                }
            }
            max = Math.max(max, word);
        }
        return max;
    }
}