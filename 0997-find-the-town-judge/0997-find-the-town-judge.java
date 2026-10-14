class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] InDeg = new int[n + 1];
        int[] OutDeg = new int[n + 1];

        for (int[] arr : trust) {
            OutDeg[arr[0]]++;
            InDeg[arr[1]]++;
        }

        for (int i = 1; i < n + 1; i++) {
            if (InDeg[i] == n - 1 && OutDeg[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
