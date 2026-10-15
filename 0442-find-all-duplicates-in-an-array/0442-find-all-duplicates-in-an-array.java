class Solution {
    public List<Integer> findDuplicates(int[] nums) {
          List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] > 0) {
                nums[num - 1] *= -1;
            } else {
                ans.add(num);
            }
        }
        return ans;
    }
}