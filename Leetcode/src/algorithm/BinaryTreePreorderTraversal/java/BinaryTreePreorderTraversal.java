package algorithm.BinaryTreePreorderTraversal.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import algorithm.TreeNode;

public class BinaryTreePreorderTraversal {
	// Recursive method
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
        addNode(result, root);
        return result;
    }
	
	public void addNode(List<Integer> list, TreeNode root) {
		if (root != null){
			list.add(root.val);
			addNode(list, root.left);
			addNode(list, root.right);
        }
	}
	// Iterative method
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root == null) return result;
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			result.add(node.val);
			if (node.right != null) stack.push(node.right);
			if (node.left != null) stack.push(node.left);
		}
		return result;
	}
}
