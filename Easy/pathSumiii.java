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
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    private int dfs(TreeNode root, int sum) {
        if (root == null) return 0;
        if (sum == root.val) return 1 + dfs(root.left, 0) + dfs(root.right, 0);
        else return dfs(root.left, sum-root.val) + dfs(root.right, sum-root.val);
    }
}