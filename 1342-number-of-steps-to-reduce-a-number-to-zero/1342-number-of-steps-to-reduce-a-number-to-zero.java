class Solution {
    public int numberOfSteps(int n) {
    int stp = 0;
    
    while(n!=0){
        if(n%2==0){
            n = n/2;
        }
        else{
            n = n-1;
        }
        stp++;
    }
    return stp;
    }
}