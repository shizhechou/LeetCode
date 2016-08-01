package algorithm.BinaryTreeRightSideView.java;

import java.util.ArrayList;
import java.util.List;

import algorithm.TreeNode;

public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		rightView(root, result, 0);
		return result;
	}

	public void rightView(TreeNode root, List<Integer> result, int depth) {
		if (root == null)
			return;
		if (depth == result.size()) {
			result.add(root.val);
		}
		rightView(root.right, result, depth + 1);
		rightView(root.left, result, depth + 1);
	}
}
