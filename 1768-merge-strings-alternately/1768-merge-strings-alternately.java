class Solution {
    public String mergeAlternately(String word1, String word2) {

        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        char res[] = new char[c1.length + c2.length];

        int i = 0;
        int j = 0;

        while(i < c1.length && i < c2.length){
            res[j++] = c1[i];
            res[j++] = c2[i];
            i++;
        }

        while(i < c1.length){
            res[j++] = c1[i++];
        }

        while(i < c2.length){
            res[j++] = c2[i++];
        }

        return new String(res);
    }
}