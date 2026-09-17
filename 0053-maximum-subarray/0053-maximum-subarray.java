class Solution {
    public int maxSubArray(int[] arr) {
        int res = arr[0];
        int maxending = arr[0];

        for(int i = 1 ; i<arr.length ; i++){
            maxending = Math.max(maxending+arr[i],arr[i]);
            res = Math.max(res,maxending);
        }
        return res;
    }
}