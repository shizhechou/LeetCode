package algorithm.LinkedListCycle.java;

import algorithm.ListNode;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		//http://blog.csdn.net/wenqian1991/article/details/17452715
        if(head == null || head.next == null)
            return false;
            
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)
                return true;
        }
        return false;
        
    }
}
