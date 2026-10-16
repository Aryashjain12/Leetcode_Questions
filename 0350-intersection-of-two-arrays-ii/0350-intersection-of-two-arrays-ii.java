class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0 ;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
            if(map.get(nums2[i])>0){
                a.add(nums2[i]);
                map.put(nums2[i] , map.get(nums2[i])-1);
            }
        }
        }
        int[] ans = new int[a.size()];
        for(int i = 0 ; i<a.size() ; i++){
            ans[i] = a.get(i);
        }
        return ans;
    }
}