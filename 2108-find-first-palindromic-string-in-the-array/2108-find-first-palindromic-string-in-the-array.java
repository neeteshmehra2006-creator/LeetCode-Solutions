class Solution {

    public boolean isPalindrome(char ch[]) {
        int low = 0;
        int high = ch.length - 1;

        while (low < high) {
            if (ch[low] != ch[high]) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {

        for (String x : words) {
            char ch[] = x.toCharArray();
            if (isPalindrome(ch)) {
               return new String(ch);
            }
        }
        return "";
    }
}