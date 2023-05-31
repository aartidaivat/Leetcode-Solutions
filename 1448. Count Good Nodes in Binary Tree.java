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
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        countGood(root, root.val);
        return count;
    }
    
    public void countGood(TreeNode root, int max) {
        if(root==null) return;
        if(root.val>=max) {
            max = root.val;
            count += 1;
        }
        countGood(root.left, max);
        countGood(root.right, max);
    }
}
