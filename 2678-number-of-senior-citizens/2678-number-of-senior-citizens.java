class Solution {
    public int countSeniors(String[] details) {
        int ans = 0 ;
        for(int i = 0 ;i<details.length ; i++){
            if(details[i].charAt(11)>'6'){
                ans++;
            }else if((int)details[i].charAt(11)=='6'){
                if((int)details[i].charAt(12)>'0'){
                    ans++;
                }
            }
        }
        return ans;
    }
}