class Solution {
    public int fib(int n) {
     //TC = 2^n  SC = O(n) becaue or call stack
     if(n==0)return 0;
     if(n==1)return 1;
     int left = fib(n-1);
     int right = fib(n-2);
     return left+right;
    }
}