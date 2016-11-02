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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;
        LinkedList<TreeNode> l = new LinkedList<TreeNode>();
        LinkedList<TreeNode> r = new LinkedList<TreeNode>();
        l.add(root.left);
        r.add(root.right);
        while (!l.isEmpty() && !r.isEmpty()) {
            TreeNode n1 = l.poll();
            TreeNode n2 = r.poll();
            if (n1.val != n2.val) return false;
            if ((n1.left == null && n2.right != null) || (n1.right == null && n2.left != null)) {
                return false;
            }
            if ((n2.left == null && n1.right != null) || (n2.right == null && n1.left != null)) {
                return false;
            }
            if (n1.left != null) {
                l.add(n1.left);
                r.add(n2.right);
            }
            if (n1.right != null) {
                l.add(n1.right);
                r.add(n2.left);
            }
        }
        return true;
    }
}