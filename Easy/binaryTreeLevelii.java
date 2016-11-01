/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        ArrayList<Integer> lvl = new ArrayList<Integer>();
        int curlvl = 1;
        int nextlvl = 0;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            lvl.add(t.val);
            curlvl--;
            if (t.left != null) {
                q.add(t.left);
                nextlvl++;
            }
            if (t.right != null) {
                q.add(t.right);
                nextlvl++;
            }
            if (curlvl == 0) {
                res.add(0, lvl);
                lvl = new ArrayList<Integer>();
                curlvl = nextlvl;
                nextlvl = 0;
            }
        }
        return res;
    }
}