package algorithm.BinaryTreeLevelOrderTraversalTwo.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import algorithm.TreeNode;

public class BinaryTreeLevelOrderTraversalTwo {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        get(list, root, 0);
        Collections.reverse(list);
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
