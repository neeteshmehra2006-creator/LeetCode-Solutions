class Solution {
    public int numberOfSpecialChars(String word) {

    HashMap<Character,Integer>map = new HashMap<>();
    int count = 0;

    for(char x : word.toCharArray()){
        map.put(x,map.getOrDefault(x,0)+1);
    }

    for(char ch = 'a'; ch<='z'; ch++){
        if(map.containsKey(ch) && map.containsKey(Character.toUpperCase(ch))){
            count++;
        }
    }

    return count;
       
    }
}