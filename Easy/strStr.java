public class Solution {
    public int strStr(String haystack, String needle) {
        int len_h = haystack.length();
        int len_n = needle.length();
        if (len_n == 0) return 0;
        for (int i = 0; i < len_h; i++) {
        	if (haystack.charAt(i) == needle.charAt(0)) {
        		boolean found = true;
        		for (int j = 1; j < len_n; j++) {
        			if(i + j >= len_h || haystack.charAt(i+j) != needle.charAt(j)) {
        				found = false;
        				break;
        			}
        		}
        		if (found)
        			return i; 
        	}
        }
        return -1;
    }
}