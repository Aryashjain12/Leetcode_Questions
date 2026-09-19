class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = 0 ;j<arr.length-i-1 ; j++){
                int s1 = bit(arr[j]);
                int s2 = bit(arr[j+1]);
                if(s1>s2){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
        
    }
    public int bit(int n){
        int count = 0 ;
        while(n!=0){
            count+=(n & 1);
            n=n/2;
        }
        return count;
    }
}