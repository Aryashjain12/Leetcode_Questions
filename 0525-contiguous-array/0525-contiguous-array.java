class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0 ; 
        int sum = 0 ;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }

            if(map.containsKey(sum)){
                ans = Math.max(ans,i-map.get(sum));
                if(sum==0){
                    map.put(sum , i);
                }
            }else{
                map.put(sum,i);
            }
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getKey()==0){
                ans = Math.max(ans, entry.getValue()+1);
            }
        }

        return ans;
    }
}