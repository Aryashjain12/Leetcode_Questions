class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> aa = new ArrayList<>();
        for(int i = nums.length-1  ; i>=0;  i--){
            int a = nums[i];
            while(a>0){
                int digit = a%10;
                a/=10;
                aa.add(digit);
            }
        }
        int[] ans= new int[aa.size()];
        int j = aa.size()-1;
        for(int i  = 0 ;i<aa.size(); i++){
            ans[i]=aa.get(j);
            j--;
        }
        return ans;
    }
}