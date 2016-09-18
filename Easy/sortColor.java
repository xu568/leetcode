public class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        for (int i = 0; i <= right && i < length;) {
        	if (nums[i] == 0) {
        		int temp = nums[left];
        		nums[left++] = nums[i];
        		nums[i] = temp;
        		i++;
        	}
        	else if (nums[i] == 1) i++;
        	else if (nums[i] == 2) {
        		int temp = nums[right];
        		nums[right--] = nums[i];
        		nums[i] = temp;
        	}
        }
    }
}