class Solution {
    public int countSubstrings(String s) {
     int count = 0;
     int n = s.length();

     for(int i = 0; i<n; i++){
        int low = i;
        int high = i;

        while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
            low--;
            high++;
            count++;
        }

         low = i;
         high = i+1;

        while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
            low--;
            high++;
            count++;
        }
     }  
     return count; 
    }
}