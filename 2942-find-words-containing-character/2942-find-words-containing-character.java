class Solution {

    public boolean isPresent(char ch[], char x) {

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == x) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            char ch[] = words[i].toCharArray();

            if (isPresent(ch, x)) {
                li.add(i);
            }
        }
        return li;
    }
}