import java.util.*;
class Solution {
    public String removeDigit(String number, char digit) {
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            li.add(Character.getNumericValue(ch));
        }

        String ans = "";

        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) == Character.getNumericValue(digit)) {
                String temp = "";

                for (int j = 0; j < li.size(); j++) {
                    if (i != j) {
                        temp = temp + li.get(j);
                    }
                }

                if (temp.compareTo(ans) > 0) {
                    ans = temp;
                }
            }
        }

        return ans;
    }
}
