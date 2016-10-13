public class Solution {
	int[] array;
	Random rand;
    public Solution(int[] nums) {
        array = nums;
        rand = new Random();
    }
    
    public int pick(int target) {
        int len = array.length;
        int counter = 0;
        int res = 0;
        for (int i = 0; i < len; i++) {
        	if (array[i] == target) {
        		counter++;
        		if (rand.nextInt(counter) == 0) {
        			res = i;
        		}
        	}
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */