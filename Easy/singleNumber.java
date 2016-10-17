public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int len = nums.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
        	res = res ^ nums[i];
        }
        return res;
    }
}