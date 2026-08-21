class Solution {
    public int scoreOfString(String s) {
        int result = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i+1]);
            result += distance;
        }
        return result;
    }
}