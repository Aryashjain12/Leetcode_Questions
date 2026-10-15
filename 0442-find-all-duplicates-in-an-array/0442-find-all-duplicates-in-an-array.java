class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums){
            if(set.contains(num)){
                ans.add(num);
            }
            set.add(num);
        }
        return ans;
    }
}