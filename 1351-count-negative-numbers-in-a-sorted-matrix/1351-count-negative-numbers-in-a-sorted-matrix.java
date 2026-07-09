class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int i=0;i<grid.length ;i++){
            int start =0;
            int end = grid[i].length-1;
            int index = -1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(grid[i][mid]>=0){
                    start = mid+1;
                }else{
                    index = mid;
                    end = mid -1;
                }
            }
            if(index==-1) continue;
            else{
                int a = grid[i].length-index;
                ans+=a;
            }
        }
        return ans;
    }
}