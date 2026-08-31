class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder(s.length());
        int i = 1;
        for( i = 1 ; i<s.length(); i+=2){
            ans.append(s.charAt(i-1));
            int x = (s.charAt(i-1)-'0');
            char y = (s.charAt(i));
            ans.append((char)(x+y));
        }
        if(s.length()%2!=0){
            ans.append(s.charAt(s.length()-1));
        }
        return ans.toString();
    }
}