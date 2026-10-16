class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[] = new char[s.length()];
        int i = 0;
        int j = 0;

        while (j != s.length()) {
            int n = indices[i];
            arr[n] = s.charAt(i);
            j++;
            i++;
        }
        return new String(arr);
    }
}