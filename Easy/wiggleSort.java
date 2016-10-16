public class Solution {
	// nums[0] <= nums[1] >= nums[2]
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length == 0) 
        	return;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
        	if ((i % 2 == 1 && nums[i] < nums[i-1]) || (i % 2 == 0 && nums[i] > nums[i-1])) {
        		int temp = nums[i];
        		nums[i] = nums[i-1];
        		nums[i-1] = temp;
        	}
        }
    }