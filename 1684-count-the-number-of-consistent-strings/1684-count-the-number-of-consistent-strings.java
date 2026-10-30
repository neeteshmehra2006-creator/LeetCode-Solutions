class Solution {
    int count = 0;
    Set<Character> set = new HashSet<>();

    public boolean isCheck(String s, String[] words) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!set.contains(ch)) {
                return false;
            }
        }
        return true;
    }

    public int countConsistentStrings(String allowed, String[] words) {

        count = 0;
        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);
            set.add(ch);
        }
        for (int i = 0; i < words.length; i++) {
            String ch = words[i];

            if (isCheck(ch, words)) {
                count++;
            }
        }
       return count;
    }
}
