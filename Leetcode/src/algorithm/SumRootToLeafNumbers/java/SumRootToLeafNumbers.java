package algorithm.SumRootToLeafNumbers.java;

import algorithm.TreeNode;

public class SumRootToLeafNumbers {
	private int total = 0;
	public int sumNumbers(TreeNode root) {
        helper(root,0);
        return total;
    }
	
	public void helper(TreeNode root, int sum){
		if(root == null){
			return;
		}
		sum= sum*10 + root.val;
		if(root.left == null && root.right == null){
			total += sum;
			return;
		}
		helper(root.left, sum);
		helper(root.right, sum);
	}
}
