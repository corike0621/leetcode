package easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "(([]){})";
		
		Solution solution = new Solution();
		System.out.println(solution.isValid(s));
		

	}

}


class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<>();
    	for (char c : s.toCharArray()) {
    		if (c == '(' || c == '[' || c == '{') {
    			stack.push(c); 
    		} else {
    			if (stack.empty()) {
					return false;
				}
    			if (c == ')' && stack.peek() == '(') {
    				stack.pop();
    			} else if (c == ']' && stack.peek() == '[') {
    				stack.pop();
    			} else if (c == '}' && stack.peek() == '{') {
    				stack.pop();
    			} else {
    				return false;
    			}
    		}
    	}
    	return stack.isEmpty();
        
    }
}