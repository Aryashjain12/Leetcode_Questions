class Solution {
    public int maxFreqSum(String s) {
        int[] hash = new int[26];
        int vow = 0 ;
        int con = 0 ;
        for(char c : s.toCharArray()){
            int i = c-'a';
            hash[i]++;
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vow=Math.max(vow,hash[i]);
            }else{
                con = Math.max(con,hash[i]);
            }
        }
        return vow+con;
    }
}