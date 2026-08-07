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
        return helper(min,max);
    }
    public static int helper(int a , int b){
        if(a==0) return b;
        return helper(b%a,a);
    }
}