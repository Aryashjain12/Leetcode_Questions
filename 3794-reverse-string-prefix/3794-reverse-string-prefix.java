class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder aa = new StringBuilder();
        for(int i = k-1 ; i>=0 ; i--){
            aa.append(s.charAt(i));
        }
        for(int i = k ; i<s.length();i++){
            aa.append(s.charAt(i));
        }
        return aa.toString();
    }
}