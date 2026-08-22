class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for(char s : stones.toCharArray()){
            if(jewels.indexOf(s)!=-1){
                ans++;
            }
        }
        return ans;
    }
}