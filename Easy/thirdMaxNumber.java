public class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i:nums) {
            if (pq.size() < 3) {
                if (!pq.contains(i)) {
                    pq.add(i);
                }
            } else {
                if (i > pq.peek() && !pq.contains(i)) {
                    pq.poll();
                    pq.add(i);
                }
            }
        }
        if (pq.size() == 3) {
            return pq.peek();
        } else {
            int value = 0;
            while(!pq.isEmpty()) {
                value = pq.poll();
            }
            return value;
        }
    }
}