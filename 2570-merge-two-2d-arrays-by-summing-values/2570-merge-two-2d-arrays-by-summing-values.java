class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> ans1= new ArrayList<>();
        int i = 0 ;
        int j = 0 ;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]<nums2[j][0]){
                ans1.add(nums1[i]);
                i++;
            }else if(nums1[i][0]>nums2[j][0]){
                ans1.add(nums2[j]);
                j++;
            }else{
                ans1.add(new int[]{nums1[i][0] , nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            ans1.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            ans1.add(nums2[j]);
            j++;
        }


        return ans1.toArray(new int[ans1.size()][2]);
    }
}