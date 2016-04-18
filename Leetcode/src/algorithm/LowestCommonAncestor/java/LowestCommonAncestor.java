package algorithm.LowestCommonAncestor.java;

import algorithm.TreeNode;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		Integer data[] = {6,2,8,0,4,7,9,null,null,3,5};
		TreeNode testTree = TreeNode.build(data);
		testTree.print();
		Integer data_p[] = {2};
		TreeNode p = TreeNode.build(data_p);
		p.printTreeNodeValue();
		Integer data_q[] = {4};
		TreeNode q = TreeNode.build(data_q);
		q.printTreeNodeValue();
		
		TreeNode result = lowestCommonAncestor(testTree, p, q);
		System.out.print("Lowest Common Ancestor is:");
		result.printTreeNodeValue();

	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q); 
        }else if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
		}
	}

}
