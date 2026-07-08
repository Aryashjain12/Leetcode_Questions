class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = words.length-1 ; i>=0 ; i--){
            if(words[i]==""){
                continue;
            }else{
            ans.append(words[i]).append(" ");}
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}