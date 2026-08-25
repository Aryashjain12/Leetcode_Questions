class Solution {
    public String reversePrefix(String word, char ch) {
        int j = 0 ; 
        char[] x = word.toCharArray();
        while(j<x.length){
            if(x[j]==ch){
                break;
            }
            j++;
        }
        if(j==x.length){
            return word;
        }
        int i = 0 ;
        while(i<j){
            char temp = x[i];
            x[i]=x[j];
            x[j]=temp;
            i++;
            j--;
        }
        return new String(x);
    }
}