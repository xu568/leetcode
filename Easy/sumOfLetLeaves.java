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
	int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        traverser(root);
        return sum;
    }
    private void traverser(TreeNode root) {
    	if (root == null) return;
    	if (root.left != null) {
    		if (root.left.left == null && root.left.right == null) {
    			sum += root.left.val;
    		} else {
    			traverser(root.left);
    		}
    	}
    	if (root.right != null) {
    		traverser(root.right);
    	}
    	return;
    }
}