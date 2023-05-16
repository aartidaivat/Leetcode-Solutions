class Solution {
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {    
        balancedTree(root);
        return balanced;
    }
  
    public int balancedTree(TreeNode root) {
        if(root==null) return 0;
        
        int left = balancedTree(root.left);
        int right = balancedTree(root.right);
        
        if(Math.abs(left-right)>1) balanced=false;
        return 1+Math.max(left,right);
        
    }
}
