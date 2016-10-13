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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;

        traverser(root, res);
        return res;

    }
    private int traverser(TreeNode root, List<List<Integer>> res) {
    	if (root == null) return 0;

    	int height = Math.max(traverser(root.left, res), traverser(root.right, res));
    	while (height >= res.size()) {
    		res.add(new ArrayList<Integer>());
    	}
    	res.get(height).add(root.val);
    	return height+1;
    }
}