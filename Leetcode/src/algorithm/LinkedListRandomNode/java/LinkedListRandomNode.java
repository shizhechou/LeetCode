package algorithm.LinkedListRandomNode.java;
import java.util.*;

import algorithm.ListNode;
public class LinkedListRandomNode {
	/** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
	ListNode head = null;
	Random rg = null;
	public Solution(ListNode head) {
	    this.head = head;
	    this.rg = new Random();
	}
	
	/** Returns a random node's value. */
	public int getRandom() {
	    ListNode result = null;
	    ListNode current = head;
	    
	    for(int i=1; current!=null; i++){
	    	if(rg.nextInt(i) == 0){
	    		result = current;
	    	}
	    	current = current.next;
	    }
	    return result.val;
	}
}
