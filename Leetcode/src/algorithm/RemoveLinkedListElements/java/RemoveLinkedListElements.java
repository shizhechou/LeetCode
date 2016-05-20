package algorithm.RemoveLinkedListElements.java;

import algorithm.ListNode;

public class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
        if(head == null)
        	return head;
        while(head != null && head.val == val){
        	head = head.next;
        }
        ListNode cur = head;
        while(cur != null && cur.next!=null){
        	if( cur.next.val == val ){
        		cur.next = cur.next.next;
        	}else{
        		cur = cur.next;
        	}
        }
        return head;
    }
}
