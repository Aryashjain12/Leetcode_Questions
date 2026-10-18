class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans  = 0 ; 
        int sum = 0 ;
        Map<Integer , Integer> map = new HashMap<>();
        for(int i  = 0 ; i <nums.length ; i++){
            sum+=nums[i];
            int need = sum - k;
            if(map.containsKey(need)){
                ans +=map.get(need);
            }
            if(need == 0){
                ans++;
            }
            
            map.put(sum , map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}