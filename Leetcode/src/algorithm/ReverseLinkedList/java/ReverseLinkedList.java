package algorithm.ReverseLinkedList.java;

import algorithm.ListNode;

public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {
        if(head == null ||head.next == null){
            return head;
        }
        ListNode last = head;
        ListNode current = head.next;
        head.next = null;
        while(current != null){
            ListNode tmp = current.next;
            current.next = last;
            last = current;
            current = tmp;
        }
        return last;
    }
	
	public static void main(String[] args) {
		Integer testArray[] = {1,3,5,2,7,3};
		ListNode testListNode = ListNode.build(testArray);
		System.out.println("Before reverseList():");
		testListNode.print();
		ListNode reverseListNode = reverseList(testListNode);
		System.out.println("After reverseList():");
		reverseListNode.print();

	}

}
