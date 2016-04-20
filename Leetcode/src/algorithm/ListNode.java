package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class ListNode {
	public int val;
	public ListNode next;
	public static int length;

	public ListNode() {
	}

	ListNode(int x) {
		val = x;
	}

	public static ListNode build(Integer[] data) {
		ListNode result = null;
		ListNode current = null;

		for (int i : data) {
			ListNode node = new ListNode(i);
			if (result == null) {
				result = node;
				current = result;
			} else {
				ListNode tmp = new ListNode(i);
				current.next = tmp;
				current = tmp;
			}
			length++;
		}
		return result;
	}

	public static ListNode getListNode(ListNode first, int pos) {
		if (pos >= first.length) {
			return null;
		}

		ListNode result = first;
		for (int i = 1; i < pos; i++) {
			result = result.next;
		}
		return result;
	}

	private int getListNodeLength(ListNode first) {
		return first.length;
	}

	public void print() {
		Queue<ListNode> queue = new ArrayDeque<ListNode>();
		queue.add(this);
		while (!queue.isEmpty()) {
			ListNode node = queue.poll();
			if (node.next != null) {
				queue.add(node.next);
			}

			System.out.print(node.val);
			if (!queue.isEmpty())
				System.out.print(" -> ");
		}
		System.out.println();
	}
}