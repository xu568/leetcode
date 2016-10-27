public class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] sum = new int[length];
        sum[0] = nums[0];
        for (int i = 1; i < length; i++) {
            if (sum[i-1] < 0) {
                sum[i] = nums[i];
            } else {
                sum[i] = nums[i] + sum[i-1];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            max = max > sum[i]? max : sum[i];
        }
        return max;
    }
}