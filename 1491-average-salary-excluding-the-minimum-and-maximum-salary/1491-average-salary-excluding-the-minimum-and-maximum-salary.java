class Solution {
    public double average(int[] salary) {
        int Total = 0;
        int min = salary[0];
        int max = salary[0];

        for (int i = 0; i < salary.length; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            Total = Total + salary[i];
        }
        int ans = Total - max - min;
        return (double) ans / (salary.length - 2);
    }
}