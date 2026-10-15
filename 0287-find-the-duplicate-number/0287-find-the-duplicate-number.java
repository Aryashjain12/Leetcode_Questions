class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int num:nums){
            if(!ans.add(num)){
                return num;
            }
        }
        return 0;
    }
}