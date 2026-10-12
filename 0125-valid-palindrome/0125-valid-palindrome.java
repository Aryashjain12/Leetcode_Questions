class Solution {
    public boolean isPalindrome(String s) {
 //       StringBuilder arr = new StringBuilder(s);
        boolean ans = true ; 
        char[] arr = s.toCharArray();
        int i = 0  ; 
        int j = arr.length - 1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(arr[i])!=Character.toLowerCase(arr[j])){
                ans = false;
                break;
            }
            i++;
            j--;
        }
        return ans;
    }
}