public class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        if (word == null && abbr == null) return true;
        if (word == null || abbr == null) return false;
        int len1 = word.length();
        int len2 = abbr.length();
        if (len2 > len1) return false;
        int start1 = 0;
        int start2 = 0;
        while (start1 < len1 && start2 < len2) {
            if (abbr.charAt(start2) <= '9' && abbr.charAt(start2) >= '0') {
                if (abbr.charAt(start2) == '0') return false;
                String num = "" + abbr.charAt(start2);
                start2++;
                while (start2 < len2 && abbr.charAt(start2) <= '9' && abbr.charAt(start2) >= '0' ) {
                    num += abbr.charAt(start2);
                    start2++;
                }
                int jump = Integer.parseInt(num);
                start1 += jump;
            } else {
                if (word.charAt(start1) != abbr.charAt(start2)) {
                    return false;
                }
                start1++;
                start2++;
            }
        }
        if (start1 == len1 && start2 == len2) {
            return true;
        } else {
            return false;
        }
    }
}