public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 2)  return null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (map.get(nums[i]) != null) {
        		int[] result = new int[2];
        		result[0] = map.get(nums[i]);
        		result[1] = i;
        		return result;
        	} else {
        		map.put(target-nums[i], i);
        	}
        }
        return null;
    }
}