package algorithm.BinaryTreeInorderTraversal.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import algorithm.TreeNode;

public class BinaryTreeInorderTraversal {
	// Recursive method
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		addNode(result, root);
		return result;
	}

	public void addNode(List<Integer> list, TreeNode root) {
		if (root != null) {
			addNode(list, root.left);
			list.add(root.val);
			addNode(list, root.right);
		}
	}
	// iterator method
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack();
		if(root == null) return result;
		while(root!=null){
			stack.push(root);
			root = root.left;
			while(root == null){
				if(stack.empty()) return result;
				root = stack.pop();
				result.add(root.val);
				root = root.right;
			}
		}
		return result;
	}
}
