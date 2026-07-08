class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int start = i;
            while (i < s.length() && s.charAt(i) != ' ')
                i++;
            for (int j = i - 1; j >= start; j--)
                ans.append(s.charAt(j));
            if (i < s.length())
                ans.append(' ');
            i++;
        }
        return ans.toString();
    }
}