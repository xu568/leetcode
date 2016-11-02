public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[counter++] = nums[i];
            }
        }
        return counter;
    }
}