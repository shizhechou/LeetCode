package algorithm.FlattenNestedListIterator.java;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/*
* public interface NestedInteger {
*
*     // @return true if this NestedInteger holds a single integer, rather than a nested list.
*     public boolean isInteger();
*
*     // @return the single integer that this NestedInteger holds, if it holds a single integer
*     // Return null if this NestedInteger holds a nested list
*     public Integer getInteger();
*
*     // @return the nested list that this NestedInteger holds, if it holds a nested list
*     // Return null if this NestedInteger holds a single integer
*     public List<NestedInteger> getList();
* }
*/

public class FlattenNestedListIterator implements Iterator<Integer>{
	private Stack<NestedInteger> stack = new Stack<>();
	public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        for(int i = nestedList.size()-1; i>=0;i--){
        	stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
    	while(!stack.isEmpty()) {
            NestedInteger curr = stack.peek();
            if(curr.isInteger()) {
                return true;
            }
            stack.pop();
            for(int i = curr.getList().size() - 1; i >= 0; i--) {
                stack.push(curr.getList().get(i));
            }
        }
        return false;
    }
    
}
