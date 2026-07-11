class Solution {
    public String firstPalindrome(String[] words) {
        String a = "";
        for(int i = 0 ; i<words.length;i++){
            String b = new StringBuilder(words[i]).reverse().toString();
            if(words[i].equals(b)){
                return b;
                }
        }
        return a;
    }
}