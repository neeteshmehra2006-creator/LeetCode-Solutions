class Solution {
    public int firstUniqChar(String s) {
    
    HashMap<Character,Integer>map = new HashMap<>();
    char sh[] = s.toCharArray();

    for(char c : sh){
      map.put(c,map.getOrDefault(c,0)+1);
    }

    for(int i = 0; i<sh.length; i++){
        if(map.get(sh[i])==1){
            return i;
        }
    }
    return -1;
    }
}