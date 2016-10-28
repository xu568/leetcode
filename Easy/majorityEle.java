public class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int counter = map.get(i) + 1;
                if (counter > length/2) {
                    return i;
                } else {
                    map.put(i, counter);
                }
            } else {
                map.put(i, 1);
            }
        }
        return -1;
    }
}