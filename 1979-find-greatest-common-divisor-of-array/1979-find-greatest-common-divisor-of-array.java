class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i  = 0 ; i <nums.length ; i++){
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
        }
        if(max%min==0){
            return min;
        }
        int ans = 0 ;
        for(int i = 1 ; i<=min/2 ; i++){
            if(min%i==0  && max%i==0){
                ans=i;
            }
        }
        return ans;
    }
}