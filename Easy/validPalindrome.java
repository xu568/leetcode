public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) 
        	return true;
        s = s.toUpperCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
        	char begin = s.charAt(i);
        	char end = s.charAt(j);
        	if (needsNextChar(begin)) {
        		i++;
        	}
        	if (needsNextChar(end)){
        		j--;
        	}
        	if (!needsNextChar(begin) && !needsNextChar(end)) {
        		if (end == begin) {
        			i++;
        			j--;
        		} else {
        			return false;
        		}
        	}
    	}
    	return true;
    }
    private boolean needsNextChar(char a) {
    	return (a < 'A' || a > 'Z') && (a < '0' || a > '9');
    }
}