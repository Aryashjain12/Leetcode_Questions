class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0 ; 
        int[] hash = new int[101];

        for(int i = 0  ; i<nums.length ; i++){
            hash[nums[i]]++;
            if(hash[nums[i]]>max){
                max = hash[nums[i]];
            }
        }
        int ans = 0 ;
        for(int i = 0 ; i<101 ; i++){
            if(hash[i]==max){
                ans+=hash[i];
            }
        }
        return ans;
    }
}