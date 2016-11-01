public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int[] res = new int[len+1];
        res[0] = 0;
        res[1] = nums[0];
        for (int i = 2; i <= len; i++) {
            res[i] = Math.max(res[i-1], res[i-2]+nums[i-1]);
        }
        return res[len];
    }
}