/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int max=maximum(root);
        return max;     
    }
    public int maximum(TreeNode node) {
        if(node==null) {
            return 0;
        }
        return 1+Math.max(maximum(node.left),maximum(node.right));
    }
}
