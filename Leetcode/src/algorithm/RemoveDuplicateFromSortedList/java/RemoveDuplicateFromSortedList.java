package algorithm.RemoveDuplicateFromSortedList.java;

import algorithm.ListNode;

public class RemoveDuplicateFromSortedList {

	public static void main(String arg[]) {
		Integer data[] = { 1, 1, 2, 3, 3 };
		ListNode testSortedList = ListNode.build(data);
		System.out.println("Before delete duplicate:");
		testSortedList.print();
		ListNode resultList = deleteDuplicates(testSortedList);
		System.out.println("After delete duplicate:");
		resultList.print();
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode preNode = head;
		ListNode current = head.next;
		while (current != null) {
			if (preNode.val != current.val) {

				preNode = preNode.next;
				current = current.next;
			} else {
				preNode.next = current.next;
				current = current.next;
			}
		}
		return head;
	}
}
