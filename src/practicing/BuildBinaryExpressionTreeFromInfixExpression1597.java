package practicing;

import java.util.Stack;

public class BuildBinaryExpressionTreeFromInfixExpression1597 {

	class Node {
		char val;
		Node left;
		Node right;

		Node() {
			this.val = ' ';
		}

		Node(char val) {
			this.val = val;
		}

		Node(char val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public Node expTree(String s) {
			Stack<Node> node = new Stack<Node>();
			Stack<Character> operands = new Stack<Character>();

			for (char c : s.toCharArray()) {
				if (Character.isDigit(c)) {
					node.push(new Node(c));
				} else if (c == '(') {
					operands.push(c);
				} else if (c == ')') {
					while (operands.peek() != '(') // until we meet another parenthesis
						node.push(buildNode(operands.pop(), node.pop(), node.pop()));
					operands.pop(); // eliminate )
				} else { // else all other operands.
					while(!operands.isEmpty() && compare(operands.peek(),c))//to do the multiplication and devision first
						node.push(buildNode(operands.pop(), node.pop(), node.pop()));
					operands.push(c);	
					
				}
			}
			while(!operands.isEmpty())//to combine last operators and nodes
				node.push(buildNode(operands.pop(),node.pop(),node.pop()));
			
			return node.peek();
			

		}

		private Node buildNode(Character operands, Node right, Node left) {
			// TODO Auto-generated method stub
			return new Node(operands, left, right); // because we are using stack, if we pop, then it should go to the
													// right side of the node first.
		}

		boolean compare(char op1, char op2) {
			if (op1 == '(' || op1 == ')')
				return false;
			return op1 == '*' || op1 == '/' || op2 == '+' || op2 == '-';  //check if operand 1 is *or/ and operand 2 is +or-
		}

	}

}
