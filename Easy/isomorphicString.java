public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || s.length() == 0) return true;
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (map1.containsKey(s.charAt(i)) && map2.containsKey(t.charAt(i))) {
                if (map1.get(s.charAt(i)) == t.charAt(i) && map2.get(t.charAt(i)) == s.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            } else if (map1.containsKey(s.charAt(i)) || map2.containsKey(t.charAt(i))) {
                return false;
            } else {
                map1.put(s.charAt(i), t.charAt(i));
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}