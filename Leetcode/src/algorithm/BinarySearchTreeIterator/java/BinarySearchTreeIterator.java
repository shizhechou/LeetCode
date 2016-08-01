package algorithm.BinarySearchTreeIterator.java;

import java.util.Stack;

import algorithm.TreeNode;

public class BinarySearchTreeIterator {
	private Stack<TreeNode> stack = new Stack<TreeNode>();
	public BinarySearchTreeIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmp = stack.pop();
        pushAll(tmp.right);
        return tmp.val;
    }
    
    public void pushAll(TreeNode node){
    	while(node != null){
    		stack.push(node);
    		node = node.left;
    	}
    }
}
