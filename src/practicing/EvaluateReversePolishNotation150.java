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
/*Fortunately, I could easily solve this problem because I have done a project that was very much similar to this. If you can understand what stack
 * does, it is really easy to solve this. When you encounters numbers, you just push it to the stack and if you encounters operands, you pop two
 * numbers and then do the operations. From the problem, it says you should do the round down to 0 when you do the / operation
 *  but it is unnecessary in JAVA because JAVA does it automatically. THe basic time complexity of this algorithm is O(n) and the space complexity is
 *  O(n) as well because we are using stack memory.*/
