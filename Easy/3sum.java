public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	int len = nums.length;
    	Arrays.sort(nums);
    	if (len < 3) return res;
    	for (int i = 0; i < len - 2; i++) {
    		int j = i + 1;
    		int k = len - 1;
    		int sum = 0;
    		while (j < k) {
    			sum = nums[i] + nums[j] + nums[k];
    			if (sum == 0) {
    				res.add(Arrays.asList(nums[i], nums[j], nums[k]));
    				k--;
    				j++;
    				while(k > j && nums[k+1] == nums[k]) k--;
    				while(k > j && nums[j-1] == nums[j]) j++;
    			}
    			if (sum > 0) {
    				k--;
    				while(k > j && nums[k+1] == nums[k]) k--;
    			}
    			if (sum < 0) {
    				j++;
    				while(k > j && nums[j-1] == nums[j]) j++;
    			}
    		}
    		while(i < len - 2 && nums[i+1] == nums[i]) i++;
    	}
    	return res;
    }

}