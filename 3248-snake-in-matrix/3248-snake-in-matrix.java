class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0 , j = 0 ;
     for(var c: commands){
        if(c.charAt(0)=='U'){
            i--;
        }else if(c.charAt(0)=='D'){
            i++;
        }else if(c.charAt(0)=='L'){
            j--;
        }else if(c.charAt(0)=='R'){
            j++;
        }
     }
     return (i*n)+j;   
    }
}