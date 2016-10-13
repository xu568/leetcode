public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        int length = nums.length;
        int[] res = new int[length];
        res[0] = 1;
        int left = 1;
        int right = 1;
        for (int i = 1; i < length; i++) {
        	left = left * nums[i-1];
        	res[i] = left;
        }
        for (int i = length-2; i >= 0; i--) {
        	right *= nums[i+1];
        	res[i] *= right;
        }
        return res;
    }
}