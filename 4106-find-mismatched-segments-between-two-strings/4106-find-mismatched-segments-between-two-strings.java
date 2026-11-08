class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {

        List<List<String>> li = new ArrayList<>();

        if (s1.equals(s2)) {
            return li;
        }

        String ans1 = "";
        String ans2 = "";

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                ans1 = ans1 + s1.charAt(i);
                ans2 = ans2 + s2.charAt(i);

            } else {
                if (!ans1.isEmpty()) {
                    li.add(Arrays.asList(ans1, ans2));
                    ans1 = "";
                    ans2 = "";
                }
            }
        }

        if (!ans1.isEmpty()) {
            li.add(Arrays.asList(ans1, ans2));
        }

        return li;
    }
}