public class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0) return res;
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> lvl = new ArrayList<Integer>();
            lvl.add(1);
            for (int j = 1; j < i; j++) {
                lvl.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            if (i > 0) {
                lvl.add(1);
            }
            res.add(lvl);
        }
        return res;
    }
}