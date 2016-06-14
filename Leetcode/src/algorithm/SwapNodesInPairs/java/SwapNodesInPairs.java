package algorithm.SwapNodesInPairs.java;

import algorithm.ListNode;

public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode cur = head;
		ListNode pre = null;
		head = cur.next;
		while (cur != null && cur.next != null) {
			ListNode tmp = cur.next;
			cur.next = tmp.next;
			tmp.next = cur;
			if (pre != null) {
				pre.next = tmp;
			}
			pre = cur;
			cur = cur.next;
		}
		return head;
	}
}
