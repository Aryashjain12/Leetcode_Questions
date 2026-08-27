class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0 ;
        for(List list:items){
            if(ruleKey.equals("type")){
                if(list.get(0).equals(ruleValue)){
                    ans++;
                }
            }else if(ruleKey.equals("color")){
                if(list.get(1).equals(ruleValue)){
                    ans++;
                }
            }else if(ruleKey.equals("name")){
                if(list.get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }
        return ans;
    }
}