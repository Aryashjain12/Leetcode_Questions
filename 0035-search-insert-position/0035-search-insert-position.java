class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0 , high = nums.length-1;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]==target){
                return mid;
            }
            else{
                low = mid+1;
                ans = low;
            }
        }
        return ans;
    }
}