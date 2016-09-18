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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root == null) return result;
        String s = "";
        s += root.val;
        if (root.left == null && root.right == null) {
        	result.add(s);
        	return result;
        }
        if (root.left != null) {
        	visit(root.left, s, result);
        }
        if (root.right != null) {
        	visit(root.right, s, result);
        }
        return result;
    }
    private void visit(TreeNode root, String s, List<String> res) {
    	s += "->";
    	s += root.val;
    	if (root.left == null && root.right == null) {
        	res.add(s);
        	return;
        }
        if (root.left != null) {
        	visit(root.left, s, res);
        }
        if (root.right != null) {
        	visit(root.right, s, res);
        }
        return;
    }
}