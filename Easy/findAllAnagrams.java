public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (s == null || s.length() < p.length()) return res;
        int[] chars = new int[26];
        int len_s = s.length();
        for (char c : p.toCharArray()) {
            chars[c-'a']++;
        }
        int diff = p.length();
        int start = 0;
        int end = 0;
        while (end < len_s) {
            if (end - start == p.length() && chars[s.charAt(start++) - 'a']++ >= 0) {
                diff++;
            }
            if (--chars[s.charAt(end++) - 'a'] >= 0) {
                diff--;
            }
            if (diff == 0) res.add(start);
        }
        return res;
    }
}