class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character , Integer> map1 = new HashMap<>();
        Map<Character , Integer> map2 = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0 ;i<s.length();i++){
            map1.put(s.charAt(i) , map1.getOrDefault(s.charAt(i), 0)+1);
            map2.put(t.charAt(i) , map2.getOrDefault(t.charAt(i), 0)+1);
        }

        for(Map.Entry<Character , Integer> entry1 : map1.entrySet()){
 //           char c = entry1.getKey();
            if(map2.containsKey(entry1.getKey())){
                int x = map2.get(entry1.getKey());
                if(x!=entry1.getValue()){
                return false;
            }
            }
            else if(!map2.containsKey(entry1.getKey())){
                return false;
            }
            
        }
        return true;
    }
}