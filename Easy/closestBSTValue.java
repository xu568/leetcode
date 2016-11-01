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
    public int closestValue(TreeNode root, double target) {
        int min = root.val;
        while (root != null) {
            min = Math.abs(root.val - target) < Math.abs(min-target)? root.val : min;
            root = root.val > target? root.left : root.right;
        }
        return min;
    }
}