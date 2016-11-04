public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null && str == null) return true;
        if (pattern == null || str == null) return false;
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;
        HashMap<Character, String> map1 = new HashMap<Character, String>();
        HashMap<String, Character> map2 = new HashMap<String, Character>();
        for (int i = 0; i < words.length; i++) {
            if (map1.containsKey(pattern.charAt(i)) && map2.containsKey(words[i])) {
                if (map1.get(pattern.charAt(i)).equals(words[i]) && map2.get(words[i]) == pattern.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            } else if (map1.containsKey(pattern.charAt(i)) || map2.containsKey(words[i])) {
                return false;
            } else {
                map1.put(pattern.charAt(i), words[i]);
                map2.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    }
}