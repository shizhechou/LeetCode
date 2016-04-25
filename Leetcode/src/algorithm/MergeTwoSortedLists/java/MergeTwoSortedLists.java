package algorithm.MergeTwoSortedLists.java;

import algorithm.ListNode;

public class MergeTwoSortedLists {

	public static void main(String arg[]){
		ListNode listNode1 = ListNode.build(new Integer[] {1,3,5,7 });
		ListNode listNode2 = ListNode.build(new Integer[] {2,4,6,8 });
		listNode1.print();
		listNode2.print();
		ListNode result = mergeTwoLists(listNode1, listNode2);
		result.print();
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode head = l1.val < l2.val ? l1 : l2;
		ListNode nonHead = l1.val < l2.val ? l2 : l1;

		head.next = mergeTwoLists(head.next, nonHead);
		return head;
	}
}
