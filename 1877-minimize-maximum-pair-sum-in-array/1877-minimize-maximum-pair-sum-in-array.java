class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0,right=n-1;
        int sum=0,max=Integer.MIN_VALUE;
        while(left<right){
            sum=nums[left]+nums[right];
            max=Math.max(sum,max);
            left++;
            right--;
        }
        return max;
    }
}