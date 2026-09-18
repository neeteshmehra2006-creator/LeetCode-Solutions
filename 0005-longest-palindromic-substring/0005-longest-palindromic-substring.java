class Solution {
    public String longestPalindrome(String s) {
    String res = "";
    int n = s.length();

    for(int i = 0; i<n; i++){
        int low = i;
        int high = i;

        //For Odd CASE

        while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
            low--;
            high++;
        }
        String curr = s.substring(low+1,high);

        if(res.length() < curr.length()){
            res = curr;
        }

        //For EVEN CASE

        low = i;
        high = i+1;

        while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
            low--;
            high++;
        }
        curr = s.substring(low+1,high);

        if(res.length() < curr.length()){
            res = curr;
        }

    } 
    return res;
    }
}