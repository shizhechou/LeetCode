package algorithm.BinaryTreeInorderTraversal.java;

import java.util.ArrayList;
import java.util.List;

import algorithm.TreeNode;

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        addNode(result, root);
        return result;
    }
	
	public void addNode(List<Integer> list, TreeNode root) {
		if (root != null){
			addNode(list, root.left);
			list.add(root.val);
			addNode(list, root.right);
        }
	}
}
