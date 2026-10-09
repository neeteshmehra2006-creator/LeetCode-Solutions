import java.util.*;

class Solution {

    public boolean isNumber(char x) {
        return x == '1' || x == '2' || x == '3' || x == '4'
                || x == '5' || x == '6' || x == '7'
                || x == '8' || x == '9' || x == '0';
    }

    public int secondHighest(String s) {
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isNumber(ch)) {
                li.add(Character.getNumericValue(ch));
            }
        }

        int max = Integer.MIN_VALUE;

        for (int x : li) {
            max = Math.max(max, x);
        }

        int smax = -1;

        for (int x : li) {
            if (x != max) {
                smax = Math.max(smax, x);
            }
        }

        return smax;
    }
}