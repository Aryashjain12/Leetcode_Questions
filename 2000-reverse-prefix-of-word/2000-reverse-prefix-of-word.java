class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int n = word.indexOf(ch);
        if(n==-1){
            return word;
        }
        for(int i = 0 ; i<=n ; i++){
            ans.append(word.charAt(i));
        }
        ans.reverse();
        for(int i = n+1 ; i<word.length();i++){
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }
}