class Solution {
    public int[] transformArray(int[] nums) {
        int  even = 0 ;
        for(int i = 0 ; i <nums.length ;i++){
            if(nums[i]%2==0){
                even++;
            }
        }
        int[] ans = new int[nums.length];
        int i = 0;
        while(even>0){
            ans[i] = 0;
            even--;
            i++;
        }
        while(i<nums.length){
            ans[i] = 1;
            i++;
        }
        return ans;
    }
}