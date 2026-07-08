class Solution {
    public int maximumCount(int[] nums) {
        int lo = 0 , hi = nums.length-1;
        int neg = -1 ; 
        int pos = -1 ; 
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>=0){
                hi=mid-1;
            }else if(nums[mid]<0){
                neg = mid;
                lo=mid+1;
            }
        }
        lo = 0 ;
        hi = nums.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]<=0){
                lo=mid+1;
            }else if(nums[mid]>0){
                pos = mid;
                hi=mid-1;
            }
        }
        if(neg==-1 && pos ==-1){
            return 0;
        }
        neg = neg+1;
        if(pos != -1){
        pos = nums.length-pos;}
        if(neg>=pos){
            return neg;
        }else return pos;
    }
}