class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       int idx1 = 0 ;
       int idx2 = 0 ;
       int worda = 0;
       int wordb = 0 ;
       while(worda<word1.length && wordb<word2.length){
        char a = word1[worda].charAt(idx1);
        char b = word2[wordb].charAt(idx2);
        if(a!=b){
            return false;
        }
        idx1++;
        idx2++;
        if(idx1>=word1[worda].length()){
            idx1=0;
            worda++;
        }
        if(idx2>=word2[wordb].length()){
            idx2=0;
            wordb++;
        }
       }
       return worda==word1.length && wordb==word2.length;
    }
}