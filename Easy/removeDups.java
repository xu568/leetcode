public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int counter = 1;
        int dup_counter = 1;
        for (int i = 1; i < len; i++) {
        	if (nums[i] != nums[i-1]) {
        		nums[counter++] = nums[i];
        		dup_counter = 1;
        	} else {
        		if (dup_counter < 2) {
        			nums[counter++] = nums[i];
        			dup_counter++;
        		} else {
        			dup_counter++;
        		}
        	}
        }
        return counter;
    }
}