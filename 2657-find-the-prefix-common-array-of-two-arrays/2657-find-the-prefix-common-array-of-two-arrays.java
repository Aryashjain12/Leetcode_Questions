class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] hash = new int[51];
        
        int[] ans = new int[A.length];
        for(int i = 0 ; i<A.length ; i++){
            for(int k = 0 ; k<=i ; k++){
            hash[B[k]]++;
        }
            int count  = 0 ;
            for(int j = 0 ; j<=i;j++){
                if(hash[A[j]]>=1){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}