class Solution {
    public int[] decompressRLElist(int[] nums) {
        int le = 0;
        for(int i  = 0 ; i<nums.length;i+=2){
            le+=nums[i];
        }
        int[] ans = new int[le];
        int idx = 0 ;
        for(int i  = 0 ; i<nums.length ; i+=2){
            int a = nums[i];
            for(int j = 0 ;j<nums[i];j++){
                ans[idx]=nums[i+1];
                idx++;
            }
        }
        return ans;
    }
}