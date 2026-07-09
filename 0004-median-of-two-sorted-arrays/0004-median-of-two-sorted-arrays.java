class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] ans = new double[nums1.length + nums2.length];
        int i = 0;
        int j= 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }
        while(j<nums2.length){
            ans[k++]=nums2[j++];
        }
        int lo = 0 , hi = ans.length-1;
        int mid = lo+(hi-lo)/2;
        
        if(ans.length%2 !=0){
            return ans[mid];
        }else if(ans.length<1){
            return 0;
        }else{
            double a = (ans[mid]+ans[mid+1])/2;
            return a;
        }
     
    }
}