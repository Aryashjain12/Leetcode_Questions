class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder arr = new StringBuilder(s);
        int i = 0  ;
        int l = s.length()-1;

        while(i<l){
            if(l-i < k){
                char temp = arr.charAt(l);
                arr.setCharAt(l , arr.charAt(i));
                arr.setCharAt(i , temp);
                i++;
                l--;
            }else{
            int x = i+k-1;
            int a = i;
            while(a<x){
            char temp = arr.charAt(x);
            arr.setCharAt(x , arr.charAt(a));
            arr.setCharAt(a , temp);
            a++;
            x--;
            }
            i+=2*k;
            }
        }
      //  arr.toString();
        return arr.toString();
    }
}