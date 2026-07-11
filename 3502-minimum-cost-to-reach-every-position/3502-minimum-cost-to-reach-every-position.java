class Solution {
    public int[] minCosts(int[] cost) {
        int[] ans = new int[cost.length];
        ans[0] = cost[0];
        int min = cost[0];
        for(int i = 1  ; i<cost.length ; i++){
            if(cost[i]>min){
                ans[i] = min;
            }else{
                ans[i] = cost[i];
                min = cost[i];
            }
        }
        return ans;
    }
}