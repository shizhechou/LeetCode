package algorithm.MaxDepthBinaryTree.java;

import algorithm.TreeNode;

public class MaxDepthBinaryTree {
	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	public static void main(String[] args) {
        TreeNode tree = TreeNode.build(new Integer[] {1,2,3,4,null,null,5});
        tree.print();
        System.out.println("The max depth is : "+maxDepth(tree));
    }
}
