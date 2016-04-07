package algorithm.InvertBinaryTree;

import algorithm.TreeNode;

public class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode tree = TreeNode.build(new Integer[] { 4, 2, 7, 1, 3, 6, 9 });
		tree.print();
		System.out.println("After invert Tree");
		tree = invertTree(tree);
		tree.print();

	}

	public static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode tmp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(tmp);
		return root;
	}

}
