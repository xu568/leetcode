public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        if (nums == null || nums.length == 0) 
        	return res;
        Arrays.sort(nums);
        int len = nums.length;
        int start = 0;
        for (int i = 0; i < len; i++) {
        	int size = res.size();
        	for (int j = start; j < size; j++) {
        		List<Integer> temp = new ArrayList<Integer>(res.get(j));
        		temp.add(nums[i]);
        		res.add(temp);
        	}
        	if (i < len-1 && nums[i+1] == nums[i]) {
        		start = size;
        	} else {
        		start = 0;
        	}
        }
        return res;
    }
}