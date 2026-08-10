class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int ans[][] = new int[image.length][image.length];
        int b = image.length-1;
        for(int i = 0 ; i<image.length ; i++){
            b = image.length-1;
            for(int j = 0 ; j <image.length ; j++){
                if(image[i][j]==1){
                    ans[i][b]=0;
                }else{
                    ans[i][b]=1;
                }
                b--;
            }
        }
        return ans;
    }
}