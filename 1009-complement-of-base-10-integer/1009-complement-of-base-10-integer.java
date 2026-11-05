class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;

        int temp = n;
        int mask = 0;
        int dummy = n;

        while(dummy != 0){
            mask = mask * 2 + 1;
            dummy = dummy / 2;
        }

        return n ^ mask;
    }
}