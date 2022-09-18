package practicing;

import java.util.Stack;

public class EvaluateReversePolishNotation150 {

	public class Solution {
	    public int evalRPN(String[] tokens) {
	        int a,b;
			Stack<Integer> stack = new Stack<Integer>();
			for (String s : tokens) {
				if(s.equals("+")) {
					stack.push(stack.pop()+stack.pop());
				}
				else if(s.equals("/")) {
					b = stack.pop();
					a = stack.pop();
					stack.push(a / b);
				}
				else if(s.equals("*")) {
					stack.push(stack.pop() * stack.pop());
				}
				else if(s.equals("-")) {
					b = stack.pop();
					a = stack.pop();
					stack.push(a - b);
				}
				else {
					stack.push(Integer.parseInt(s));
				}
			}	
			return stack.peek();
		}
	}

}
