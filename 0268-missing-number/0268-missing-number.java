class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual = (n*(n+1))/2;
        int exp = 0 ;
        for(int num:nums){
            exp+=num;
        }
    return actual-exp;
    }
}