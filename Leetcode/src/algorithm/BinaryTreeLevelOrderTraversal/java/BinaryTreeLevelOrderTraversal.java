package algorithm.BinaryTreeLevelOrderTraversal.java;

import java.util.ArrayList;
import java.util.List;

import algorithm.TreeNode;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        get(list, root, 0);
        return list;
    }
    
    public void get(List<List<Integer>> list,TreeNode root,int level){
        if(root == null) return;
        List<Integer> subList = null;
        if(list.size() == level){
            subList = new ArrayList<Integer>();
            list.add(subList);
        }
        subList = list.get(level);
        subList.add(root.val);
        get(list, root.left, level+1);
        get(list, root.right, level+1);
    }
}
