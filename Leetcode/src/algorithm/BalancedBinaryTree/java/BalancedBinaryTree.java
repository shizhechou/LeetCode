package algorithm.BalancedBinaryTree.java;

import algorithm.TreeNode;

public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        if(Math.abs(left - right) > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
        
    }
    
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null) return 1;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
