public class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        if (s_len == t_len) {
        	int counter = 0;
        	for (int i = 0; i < s_len; i++) {
        		if (s.charAt(i) != t.charAt(i)) {
        			counter ++;
        		}
        	}
        	if (counter == 1) return true;
        	else return false;
        } else {
        	if (s_len < t_len) {
        		String temp = s;
        		s = t;
        		t = temp;
        		s_len = s.length();
        		t_len = t.length();
        	}
        	if (s_len - t_len != 1) {
        		return false;
        	} else {
        		int i = 0;
        		for(; i < t_len; i++) {
        			if (s.charAt(i) != t.charAt(i)) 
        				break;
        		}
        		String s1 = s.substring(i+1);
        		String s2 = t.substring(i);
        		return s1.equals(s2);
        	}
        }
    }
}