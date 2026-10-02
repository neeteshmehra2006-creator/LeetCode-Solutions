class Solution {
    public void helper(int n, String curr, int lc, int rc, List<String> ans){
        if(2*n == curr.length()){
             ans.add(curr);
             return;
        }
        if(lc < n) helper(n , curr+"(", lc+1, rc, ans);
        if(rc < lc) helper(n ,curr+")", lc, rc+1, ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n,"",0,0,ans);
        return ans;

    }
} 