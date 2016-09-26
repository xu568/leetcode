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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        int current_lvl = 1;
        int next_lvl = 0;
        ArrayList<Integer> lvl = new ArrayList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
        	TreeNode curr = queue.poll();
        	current_lvl--;
        	lvl.add(curr.val);
        	if (curr.left != null) {
        		queue.add(curr.left);
        		next_lvl++;
        	}
        	if (curr.right != null) {
        		queue.add(curr.right);
        		next_lvl++;
        	}
        	if (current_lvl == 0) {
        		res.add(lvl);
        		current_lvl = next_lvl;
        		next_lvl = 0;
        		lvl = new ArrayList<Integer>();
        	}
        }
        return res;
   	}
}