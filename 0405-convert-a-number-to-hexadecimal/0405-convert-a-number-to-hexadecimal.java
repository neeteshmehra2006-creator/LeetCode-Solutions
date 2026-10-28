
class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        String ans = "";
        long n = num;

        if (n < 0) {
            n += 4294967296L;
        }

        while (n != 0) {
            int rem = (int)(n % 16);

            if (rem <= 9) {
                ans = ans + rem;
            } else {
                ans = ans + (char)('a' + rem - 10);
            }

            n = n / 16;
        }

        char arr[] = ans.toCharArray();
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        return new String(arr);
    }
}
