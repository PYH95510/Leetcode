package practicing;

import java.util.Stack;

public class BuildBinaryExpressionTreeFromInfixExpression1597 {

	class Node {
		      char val;
		      Node left;
		      Node right;
		      Node() {this.val = ' ';}
		      Node(char val) { this.val = val; }
		      Node(char val, Node left, Node right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	
	
	class Solution{
		public Node expTree(String s) {
			Stack <Node> node = new Stack <Node>();
			Stack <Character> operands = new Stack <Character>();
			
			for(char c: s.toCharArray()) {
				if()
			}
			
			
		}
		
		
	}

}
