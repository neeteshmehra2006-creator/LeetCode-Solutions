
class Solution {
    public int minimumSum(int num) {
        int a = num / 1000;
        int b = (num / 100) % 10;
        int c = (num / 10) % 10;
        int d = num % 10;

        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        int num1 = arr[0] * 10 + arr[2];
        int num2 = arr[1] * 10 + arr[3];

        return num1 + num2;
    }
}
