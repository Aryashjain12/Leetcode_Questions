class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0 ; 
        int[] a = heights.clone();
        Arrays.sort(heights);

        for(int i = 0 ; i < heights.length ; i++){
            if(a[i]!=heights[i]){
                ans++;
            }
        }
        return ans;
    }
}