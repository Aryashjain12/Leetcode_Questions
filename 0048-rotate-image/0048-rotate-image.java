class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix.length];
        int a = 0 ;
        int b = -1 ;
        for(int i = matrix.length-1 ; i>=0 ; i--){
            a = 0;
            b++;
            for(int j = 0 ; j < matrix.length ; j++){
                ans[a][b] = matrix[i][j];
                a++;
            }
        }
        for(int i = 0 ; i <matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}