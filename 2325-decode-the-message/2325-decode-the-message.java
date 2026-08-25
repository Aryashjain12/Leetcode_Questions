class Solution {
    public String decodeMessage(String key, String message) {
        int[] hash = new int[123];
        int x = 97;
        for(int i = 0 ;i<key.length();i++){
            if(key.charAt(i)==' '){
                continue;
            }
            else if(hash[key.charAt(i)]==0){
                hash[key.charAt(i)] = x;
                x++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ;i<message.length();i++){
            if(message.charAt(i)==' '){
                ans.append(' ');
            }else{
                ans.append((char)hash[message.charAt(i)]);
            }
        }
        return ans.toString();
    }
}