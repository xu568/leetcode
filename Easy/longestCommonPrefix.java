public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int len = strs.length;
        String prefix = strs[0];
        for (int i = 0; i < len; i++) {
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0,j);
            if (prefix.equals("")) break;
        }
        return prefix;
    }
}