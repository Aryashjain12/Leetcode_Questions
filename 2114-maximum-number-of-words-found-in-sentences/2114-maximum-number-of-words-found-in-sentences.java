class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0 ; 
        for(String s:sentences){
            int a  = s.split(" ").length;
            if(a>max){max=a;}
        }
        return max;
    }
}