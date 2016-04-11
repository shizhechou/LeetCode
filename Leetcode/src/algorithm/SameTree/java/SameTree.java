package algorithm.SameTree.java;

import algorithm.TreeNode;

public class SameTree {

	public static void main(String[] args) {
		TreeNode tree1 = TreeNode.build(new Integer[] { 4, 2, 7, 1, 3, 6, 9 });
		TreeNode tree2 = TreeNode.build(new Integer[] { 4, 2, 7, 1, 3, 6, 9 });
		TreeNode tree3 = TreeNode.build(new Integer[] { 4, 2, 7, 1, 3, 6 });
		
		System.out.println("Tree1 :");
		tree1.print();
		System.out.println("Tree2 :");
		tree2.print();
		System.out.println("Tree3 :");
		tree3.print();
		
		System.out.println("After compare Tree1 & Tree2:"+isSameTree(tree1,tree2));
		System.out.println("After compare Tree2 & Tree3:"+isSameTree(tree2,tree3));

	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
	    if(p == null && q == null){
	      return true;
	    }
	  
	    if((p == null && q != null) || (p != null && q == null)){
	      return false;
	    }
	  
	    if(p.val != q.val){
	      return false;
	    }
	  
	    return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
	  }

}
