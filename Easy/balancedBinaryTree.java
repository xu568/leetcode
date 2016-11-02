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
    public boolean isBalanced(TreeNode root) {
        if (depth(root) == -1)
            return false;
        else
            return true;
    }
    private int depth(TreeNode root) {
        if (root == null) return 0;
        int left_height = depth(root.left);
        if (left_height == -1) return -1;
        int right_height = depth(root.right);
        if (right_height == -1) return -1;
        if (Math.abs(left_height-right_height) > 1) {
            return -1;
        }
        else {
            return 1+Math.max(left_height, right_height);
        }
    }
}