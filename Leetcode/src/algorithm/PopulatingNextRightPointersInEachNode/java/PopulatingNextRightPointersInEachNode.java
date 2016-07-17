package algorithm.PopulatingNextRightPointersInEachNode.java;

import algorithm.TreeNode;

public class PopulatingNextRightPointersInEachNode {
	public void connect(TreeNode root) {
		if (root == null)
			return;
		if (root.left != null) {
			root.left.next = root.right;
			if (root.next != null) {
				root.right.next = root.next.left;
			}
		}
		connect(root.left);
		connect(root.right);
	}
}
