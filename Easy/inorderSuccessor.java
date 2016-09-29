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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    	if (root == null || p == null) return null;
        if (p.right != null) {
        	TreeNode curr = p.right;
        	while (curr.left != null) {
        		curr = curr.left;
        	}
        	return curr;
        } else {
        	TreeNode r = root;
        	TreeNode res = null;
        	while (r != p) {
        		if (r.val > p.val) {
        			res = r;
        			r = r.left;
        		} else {
        			r = r.right;
        		}
        	}
        	return res;
        }
    }
}