package algorithm.ConvertSortedArrayToBinarySearchTree.java;

import algorithm.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		int len = nums.length;
        if(len == 0)
        	return null;
        TreeNode head = helper(nums, 0, len-1);
        return head;
    }
	
	public TreeNode helper(int[] nums, int low, int high){
		if(low > high){
			return null;
		}
		int mid = (low+high)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, low, mid-1);
		node.right = helper(nums, mid+1, high);
		return node;
	}
}
