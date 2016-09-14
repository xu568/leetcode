public class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
    	int len = s.length();
    	int[] nums = new int[len+1];
    	nums[0] = 1;
    	if (s.charAt(0) != '0') {
    		nums[1] = 1;
    	} else {
    		nums[1] = 0;
    	}
    	for (int i = 2; i <= len; i++) {
    		if(s.charAt(i-1) != '0') {
    			nums[i] = nums[i-1];
    		}
    		int number = (s.charAt(i-1) - '0') + (s.charAt(i-2) - '0') * 10;
    		if (number <= 26 && number >= 10) {
    			nums[i] += nums[i-2];
    		}
    	}
    	return nums[len];
	}

}