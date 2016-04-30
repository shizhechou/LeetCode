package algorithm.ImplementQueueUsingStacks.java;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	Stack<Integer> pushStk = new Stack<>();
    Stack<Integer> popStk = new Stack<>();
    // Push element x to the back of queue.
    public void push(int x) {
        if(pushStk.empty()){
            while(!popStk.empty()){
                pushStk.push(popStk.pop());
            }
        }
        pushStk.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(popStk.empty()){
            while(!pushStk.empty()){
                popStk.push(pushStk.pop());
            }
        }
        popStk.pop();
    }

    // Get the front element.
    public int peek() {
        if(popStk.empty()){
            while(!pushStk.empty()){
                popStk.push(pushStk.pop());
            }
        }
        return popStk.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return pushStk.empty() && popStk.empty();
    }
    
}
