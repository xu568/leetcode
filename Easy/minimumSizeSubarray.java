public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int min_len = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        int right = 0;
        int len = nums.length;
        boolean found = false;
        while (right < len) {
        	sum += nums[right++];
        	if (sum >= s) {
        		found = true;
        		min_len = min_len < (right - left) ? min_len : (right - left);
        		while (left < right && sum >= s) {
        			min_len = min_len < (right - left) ? min_len : (right - left);
        			sum -= nums[left++];
        		}
        	}
        }
        return found ? min_len : 0;
    }
}