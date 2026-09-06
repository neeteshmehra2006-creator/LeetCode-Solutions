class Solution {
    public boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String reverseVowels(String s) {
    char ch[] = s.toCharArray();
    int n = ch.length;
    int low = 0;
    int high = n-1;
    while(low<=high){
    if(!isvowel(ch[low])){
    low++;
    }
    else if(!isvowel(ch[high])){
        high--;
    }
    else{
        char temp = ch[low];
        ch[low] = ch[high];
        ch[high] = temp;
        low++;
        high--;
    }
    }
    return new String(ch); 
    }
}