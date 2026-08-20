class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ans1 = new ArrayList<>();
        for(int i=0 ; i<nums.length-1 ; i+=2){
            int a = nums[i];
            while(a>0){
                ans1.add(nums[i+1]);
                a--;
            }
        }
        int[] ans = new int[ans1.size()];
        for(int i  = 0 ; i<ans1.size();i++){
            ans[i] = ans1.get(i);
        }
        return ans;
    }
}