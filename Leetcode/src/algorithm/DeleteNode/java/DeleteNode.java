package algorithm.DeleteNode.java;

public class DeleteNode {
	public void deleteNode(ListNode node) {
        ListNode n1 = null;
        n1 = node.next;
        if(n1 != null){
            node.val = n1.val;
            node.next = n1.next;
        }
    }
}
