public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i : nums1) {
            hs.add(i);
        }
        for (int i : nums2) {
            if (hs.contains(i)) {
                res.add(i);
            }
        }
        int[] result = new int[res.size()];
        int counter = 0;
        for (Integer i : res) {
            result[counter++] = i;
        }
        return result;
    }
}