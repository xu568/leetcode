public class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) return 0;
        int len = s.length();
        int res = 0;
        for (int i = len-1; i >= 0; i--) {
            res += (s.charAt(i)-'A' + 1) * Math.pow(26, (len-i-1));
        }
        return res;
    }
}