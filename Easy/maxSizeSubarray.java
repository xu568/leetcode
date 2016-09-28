public class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        for (int i = 0; i < len; i++) {
        	sum += nums[i];
        	if (!map.containsKey(sum))
        		map.put(sum, i);
        	if (map.get(sum-k) != null) {
        		int length = i - map.get(sum-k);
        		if (length > max) {
        			max = length;
        		}
        	}
        }
        return max;
    }
}