package algorithm.BinaryTreePaths.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import algorithm.TreeNode;

public class BinaryTreePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = TreeNode.build(new Integer[] { 1, 2, 3, null, 5, null, 9 });
		List<String> res = binaryTreePaths(tree);
		Iterator<String> iter = res.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().toString());
		}

	}
	
	public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        binaryTreePathsHelper(result, root, new StringBuilder());
		return result;
    }
	
	private static void binaryTreePathsHelper(List<String> list, TreeNode node, StringBuilder str){
		if(node == null){
			return;
		}
		int len = str.length();
		str.append(node.val);
		if(node.left == null && node.right == null){
			list.add(str.toString());
			// Because all callback of binaryTreePathsHelper use same StringBuilder to save path.
			// We need to cut the path, let it is like before add child value.
			str.setLength(len);
			return;
		}
		str.append("->");
		binaryTreePathsHelper(list, node.left, str);
		binaryTreePathsHelper(list, node.right, str);
		str.setLength(len);
	}

}
