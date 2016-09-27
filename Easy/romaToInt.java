public class Solution {
	private int rtoi(char c) {
		switch(c) {
			case 'I' : return 1;
			case 'V' : return 5;
			case 'X' : return 10;
			case 'L' : return 50;
			case 'C' : return 100;
			case 'D' : return 500;
			case 'M' : return 1000;
			default : return 0;
		}
	}
    public int romanToInt(String s) {
    	if (s == null || s.length() == 0) return 0;
    	int sum = 0;
        int len = s.length();
        sum += rtoi(s.charAt(0));
        for (int i = 1; i < len; i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
        	if (rtoi(curr) > rtoi(prev)) {
        	    sum += rtoi(curr) - 2 * rtoi(prev);
        	} else {
        	    sum += rtoi(curr);
        	}
        }
        return sum;
    }
}