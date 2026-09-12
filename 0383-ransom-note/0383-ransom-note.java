class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    
    HashMap<Character,Integer>map = new HashMap<>();

    for(int i = 0; i<ransomNote.length(); i++){
        char ch = ransomNote.charAt(i);

        map.put(ch,map.getOrDefault(ch,0)+1);
    }

    for(int i = 0; i<magazine.length(); i++){
        char rs = magazine.charAt(i);

        if(map.containsKey(rs)){
           map.put(rs, map.get(rs) - 1);
        }
    }
    for(char x : map.keySet()){
        if(map.get(x)>0){
            return false;
        }
    }
    return true;
    }
}