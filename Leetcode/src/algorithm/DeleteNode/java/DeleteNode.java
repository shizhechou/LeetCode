package algorithm.DeleteNode.java;

import algorithm.ListNode;

public class DeleteNode {
	public static void deleteNode(ListNode node) {
		ListNode n1 = null;
		n1 = node.next;
		if (n1 != null) {
			node.val = n1.val;
			node.next = n1.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode listNode = ListNode.build(new Integer[] { 4, 2, 7, 1, 3, 6, 9 });
		// Original ListNode list
		listNode.print();
		// Get delete ListNode
		ListNode deleteNode = ListNode.getListNode(listNode, 2);
		deleteNode.print();
		// After deleteNode
		deleteNode(deleteNode);
		listNode.print();
	}
}
