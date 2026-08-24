class Solution {
    public String interpret(String command) {
        StringBuilder aa = new StringBuilder();
        for(int i = 0 ; i<command.length() ; i++){
            if(command.charAt(i)=='G'){
                aa.append('G');
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                aa.append('o');
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                aa.append('a');
                aa.append('l');
            }
        }
        return aa.toString();
    }
}