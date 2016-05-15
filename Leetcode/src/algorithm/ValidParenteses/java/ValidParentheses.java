package algorithm.ValidParenteses.java;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return false;
		Stack<Character> stack = new Stack<>();
		int num = s.length();
		char c;
		for (int i = 0; i < num; i++) {
			c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				if (c - stack.peek() > 2) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
}
