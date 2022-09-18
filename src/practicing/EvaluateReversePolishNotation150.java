package practicing;

import java.util.Stack;

public class EvaluateReversePolishNotation150 {

	public class Solution {
	    public int evalRPN(String[] tokens) {
	        int tmt1,tmt2;
			Stack<Integer> stack = new Stack<Integer>();
			for (String s : tokens) {
				if(s.equals("+")) {
					stack.push(stack.pop()+stack.pop());
				}
				else if(s.equals("/")) {
					tmt2 = stack.pop();
					tmt1 = stack.pop();
					stack.push(tmt1 / tmt2);
				}
				else if(s.equals("*")) {
					stack.push(stack.pop() * stack.pop());
				}
				else if(s.equals("-")) {
					tmt2 = stack.pop();
					tmt1 = stack.pop();
					stack.push(tmt1 - tmt2);
				}
				else {
					stack.push(Integer.parseInt(s));
				}
			}	
			return stack.peek();
		}
	}

}
/*Fortunately, I could easily solve this problem because I have done a project that was very much similar to this*/
