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
    public boolean isValidBST(TreeNode root) {
    	return traverser(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean traverser(TreeNode root, long lower_bound, long upper_bound) {
    	if (root == null) return true;
    	if (root.val > lower_bound && root.val < upper_bound)
    		return traverser(root.left, lower_bound, root.val) && traverser(root.right, root.val, upper_bound);
    	return false;
    }
}