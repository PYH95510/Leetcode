package practicing;

import java.util.HashMap;

public class CopyListwithRandomPointer138 {

	
	
	class Node {
	    public int val;
	    public Node next;
	    public Node random;

	    public Node() {}

	    public Node(int _val,Node _next,Node _random) {
	        val = _val;
	        next = _next;
	        random = _random;
	    }
	};
	
	public class Solution {
	  
	  HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();

	  public Node copyRandomList(Node head) {

	    if (head == null) {
	      return null;
	    }

	    
	    if (this.visitedHash.containsKey(head)) {
	      return this.visitedHash.get(head);
	    }

	    
	    Node node = new Node(head.val, null, null);

	    
	    this.visitedHash.put(head, node);

	    
	    node.next = copyRandomList(head.next);
	    node.random = copyRandomList(head.random);

	    return node;
	  }
	}

}
