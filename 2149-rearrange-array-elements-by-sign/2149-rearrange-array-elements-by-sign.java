class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a =  0 , b = 0 ; 
        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];
        for(int i = 0 ; i <nums.length ; i++){
            if(nums[i]>=0){
                arr1[a] = nums[i];
                a++;
            }else{
                arr2[b] = nums[i];
                b++;
        }}
        a=0;b=0;
        for(int i = 0 ; i<nums.length ; i++){
            if(i%2==0){
                nums[i] =arr1[a++]; 
            }else{
                nums[i] = arr2[b++];
            }
        }
        return nums;
    }
}