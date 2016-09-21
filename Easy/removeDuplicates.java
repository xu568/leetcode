public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (nums == null) return 0;
        if (length == 0 || length == 1) return length;
        int index = 1;
        for (int i = 1; i < length; i++) {
        	if (nums[i] > nums[index-1]) {
        		nums[index++] = nums[i];
        	} else {
        		for (int j = i+1; j < length; j++) {
        			if (nums[j] > nums[i]) {
        				nums[index++] = nums[j];
        				i = j;
        				break;
        			}
        		}
        	}
        }
        return index;
    }
}