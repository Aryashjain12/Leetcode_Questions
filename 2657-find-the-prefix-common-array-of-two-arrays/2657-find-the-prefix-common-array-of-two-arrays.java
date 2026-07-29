class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq = new int[B.length+1];
        int[] ans = new int[A.length];
        int com = 0;
        for(int i = 0 ; i<A.length ; i++){
            freq[A[i]]++;
            
            if(freq[A[i]]>=2){
                com++;
            }
            freq[B[i]]++;
            if(freq[B[i]]>=2){
                com++;
            }
            ans[i]=com;
        }
        return ans;
    }
}