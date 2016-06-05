package algorithm.MinStack.java;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stk;
	int min;
	/** initialize your data structure here. */
    public MinStack() {
    	stk = new Stack<>();
    	min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x<=min){
        	stk.push(min);
        	min=x;
        }
        stk.push(x);
    }
    
    public void pop() {
        if(stk.peek() == min){
        	stk.pop();
        	min=stk.pop();
        }else{
        	stk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min;
    }
}
