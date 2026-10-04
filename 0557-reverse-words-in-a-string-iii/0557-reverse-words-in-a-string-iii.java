class Solution {
    public String reverseWords(String s) {

        char arr[] = s.toCharArray();
        int low = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                int high = i - 1;
                while (low < high) {
                    char temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    low++;
                    high--;
                }
                low = i + 1;
            }
        }
        return new String(arr);
    }
}