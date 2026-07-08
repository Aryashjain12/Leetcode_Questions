class Solution {
    public String reverseOnlyLetters(String s) {
        int  i = 0  ; 
        char[] a = s.toCharArray();
        int j = a.length-1;
        while(i<j){
            if(a[i]<'A' || a[i]>'z'){
                i++;
                continue;
            }
            if(a[j]<'A' || a[j]>'z'){
                j--;
                continue;
            }
            if(a[i]>'Z' && a[i]<'a'){
                i++;
                continue;
            }
            if(a[j]>'Z' && a[j]<'a'){
                j--;
                continue;
            }
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(a);
    }
}