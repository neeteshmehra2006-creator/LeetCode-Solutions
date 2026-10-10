
class Solution {

    public boolean isConditions(int x, int y, int z,int a, int b, int c,int i, int j, int k) {

       if (i < j && j < k &&
            Math.abs(x - y) <= a &&
            Math.abs(y - z) <= b &&
            Math.abs(x - z) <= c) {
            return true;
        }

        return false;
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (isConditions(arr[i], arr[j], arr[k],a, b, c, i, j, k)){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
