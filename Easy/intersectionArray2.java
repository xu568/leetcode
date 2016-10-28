public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        LinkedList<Integer> q = new LinkedList<Integer>();
        for (int i : nums2) {
            if (map.containsKey(i)) {
                q.add(i);
                int counter = map.get(i);
                counter--;
                if (counter == 0) {
                    map.remove(i);
                } else {
                    map.put(i, counter);
                }
            }
        }
        int[] result = new int[q.size()];
        int counter = 0;
        while (!q.isEmpty()) {
            result[counter++] = q.poll();
        }
        return result;
    }
}