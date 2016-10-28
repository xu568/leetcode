public class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        int counter = 0;
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
        	if (hs.contains(s.charAt(i))) {
        		counter += 2;
        		hs.remove(s.charAt(i));
        	} else {
        		hs.add(s.charAt(i));
        	}
        }
        if (!hs.isEmpty()) {
        	counter += 1;
        }
        return counter;
    }
}