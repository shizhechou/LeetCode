package algorithm.PalindromeLinkedList.java;

import algorithm.ListNode;

public class PalindormeLinkedList {

	public static void main(String[] args) {
		ListNode listNode = ListNode.build(new Integer[] { 1, 2, 3, 2, 1 });
		listNode.print();
		System.out.println("Is palindorme : " + isPalindrome(listNode));
	}
	
	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}

		ListNode middle = getListMiddle(head);
		middle = reverseList(middle);
		return compareLinkList(head, middle);
	}

	public static ListNode getListMiddle(ListNode head) {
		ListNode tmp = head;
		while (tmp.next != null && tmp.next.next != null) {
			tmp = tmp.next.next;
			head = head.next;
		}
		tmp = head.next;
		head.next = null;
		return tmp;
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode last = head;
		ListNode current = head.next;
		head.next = null;

		while (current != null) {
			ListNode tmp = current.next;
			current.next = last;
			last = current;
			current = tmp;
		}
		return last;
	}

	public static boolean compareLinkList(ListNode first, ListNode second) {
		while (first != null && second != null) {
			if (first.val != second.val)
				return false;
			first = first.next;
			second = second.next;
		}
		return true;
	}
}
