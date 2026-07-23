class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0 ; 
        int b = 0 ;
        boolean a = false;
        for(int i = 0 ; i<words.length ; i++){
            for(int j = 0 ; j<words[i].length();j++){
                for(int k = 0 ;k<allowed.length();k++){
                    if(words[i].charAt(j)==allowed.charAt(k)){
                        a = true;
                        break;
                    }
                }
                if(a==false){
                    b++;
                    break;
                }else{
                    a=false;
                }
            }
            if(b==0){
                ans++;
            }else{
                b=0;
                continue;
            }
        }
        return ans;
    }
}