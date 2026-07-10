class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0 ;
        int j = mat.length -1 ;
        for(int i = 0 ; i<mat.length ; i++){
            if(i==j){
                sum = sum+mat[i][i];
                j--;
                continue;
            }
            sum = sum+mat[i][i];
            sum = sum + mat[i][j];
            j--;
        }
        return sum;
    }
}