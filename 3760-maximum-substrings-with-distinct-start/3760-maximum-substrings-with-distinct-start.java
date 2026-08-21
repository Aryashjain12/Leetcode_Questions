class Solution {
    public int maxDistinct(String s) {
        int[] hash = new int[123];
        int ans = 0;
        for(int i = 0 ; i<s.length();i++){
            hash[(int) s.charAt(i)]++;
        }
        for(int i = 95 ; i<123 ; i++){
            if(hash[i]>=1){
                ans++;
            }
        }

        return ans;
    }
}