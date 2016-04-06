package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	public static TreeNode build(Integer[] data) {
		return build(1, data);
	}

	private static TreeNode build(int index, Integer[] data) {
		if (index > data.length) {
			return null;
		}

		if (data[index - 1] == null) {
			return null;
		}

		TreeNode result = new TreeNode(data[index - 1]);
		result.left = build(index * 2, data);
		result.right = build(index * 2 + 1, data);

		return result;
	}

	public void print() {
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		queue.add(this);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			System.out.print(node.val + " ");
		}
		System.out.println();
	}

}
