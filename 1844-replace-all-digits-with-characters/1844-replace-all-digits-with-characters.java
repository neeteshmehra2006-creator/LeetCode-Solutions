class Solution {

  public boolean isNumber(char c){
        return c == '1' || c == '2' || c == '3' || c == '4' || c == '5'
                || c == '6' || c == '7' || c == '8' || c == '8' || c == '9'
                || c == '0';
    }

  public String replaceDigits(String s){
    String ans = "";
    for (int i = 0; i < s.length(); i++) {
            if (isNumber(s.charAt(i))) {
               char ch = s.charAt(i - 1);
               int n = s.charAt(i) - '0';
               ch = (char)(ch + n);   
                ans = ans + ch;
            } else {
                ans = ans + s.charAt(i);
            }
        } 
     return ans;
    }
}