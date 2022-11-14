package practicing;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle141 {
	
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	
//	public class Solution {
//		public boolean hasCycle(ListNode head) {
//		       Set<ListNode>cycle = new HashSet<ListNode>();
//		        
//		        while(head!=null){
//		            if(cycle.contains(head))return true;
//		            
//		            cycle.add(head);
//		            head = head.next;
//		        }
//		        
//		        return false;
//		        
//		    }
//	}
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	        if (head == null) return false;
	        
	        ListNode slow = head;
	        ListNode fast = head.next;
	        while (slow != fast) {
	            if (fast == null || fast.next == null) return false;
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        
	        return true;
	    }
	}
	
}
/*using hash algorithm has o(n) time complexity (using while loop) (add and contains for hash time complexity is only o(1). Space complexity for Hash
 * is O(n). However, I prefer the below solution.*/
 