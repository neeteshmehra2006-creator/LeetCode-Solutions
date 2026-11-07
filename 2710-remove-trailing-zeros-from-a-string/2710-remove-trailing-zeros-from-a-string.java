class Solution {
    public String removeTrailingZeros(String num) {
        String ans = "";
        int n = num.length();
        int say = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (num.charAt(i) == '0' && say == 0) {
                continue;
            }
            if (num.charAt(i) != '0') {
                say++;
            }
            ans = ans + num.charAt(i);
        }
        int low = 0;
        int high = ans.length() - 1;
        char ch[] = ans.toCharArray();

        while (low < high) {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        return new String(ch);
    }
}