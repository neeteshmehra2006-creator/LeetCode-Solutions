class Solution {
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;

        for(int i = 0; i < n; i++) {

            HashSet<Integer> set = new HashSet<>();

            for(int j = 0; j < n; j++) {

                int value = matrix[i][j];

                if(value < 1 || value > n) {
                    return false;
                }

                if(set.contains(value)) {
                    return false;
                }

                set.add(value);
            }
        }

        for(int i = 0; i < n; i++) {

            HashSet<Integer> set = new HashSet<>();

            for(int j = 0; j < n; j++) {

                int value = matrix[j][i];

                if(value < 1 || value > n) {
                    return false;
                }

                if(set.contains(value)) {
                    return false;
                }

                set.add(value);
            }
        }

        return true;
    }
}