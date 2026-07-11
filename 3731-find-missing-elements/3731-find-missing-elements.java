class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int end = nums[nums.length-1];
        int start = nums[0];
        int i = 0 ;
        while(start!=end){
            if(nums[i+1]!=start+1){
                ans.add(start+1);
                start++;
            }else{
                start++;
                i++;
            }
        }
        return ans;
    }
}