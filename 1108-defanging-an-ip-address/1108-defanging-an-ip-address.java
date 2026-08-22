class Solution {
    public String defangIPaddr(String address) {
        StringBuilder an = new StringBuilder();
        for(int i = 0 ; i<address.length();i++){
            if(address.charAt(i)=='.'){
                an.append('[');
                an.append(address.charAt(i));
                an.append(']');
            }else{
                an.append(address.charAt(i));
            }
        }
        return an.toString();
    }
}