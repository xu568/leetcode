public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < len; i++) {
        	if (pq.size() < k) {
        		pq.add(nums[i]);
        	} else {
        		int curr = pq.poll();
        		if (nums[i] > curr) {
        			pq.add(nums[i]);
        		} else {
        			pq.add(curr);
        		}
        	}
        }
        return pq.poll();
    }
}