class Solution {
    public String mergeAlternately(String word1, String word2) {
     StringBuilder ans = new StringBuilder();
     int n = word1.length();
     if(word1.length()<word2.length()){
        n = word1.length();
     }else{
        n = word2.length();
     }
     for(int i = 0 ;i<n ; i++){
        ans.append(word1.charAt(i));
        ans.append(word2.charAt(i));
     }
     while(n<word1.length()){
        ans.append(word1.charAt(n));
        n++;
     }
      while(n<word2.length()){
        ans.append(word2.charAt(n));
        n++;
     }
     return ans.toString();     
    }
}