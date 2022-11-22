package practicing;

public class IntersectionofTwoLinkedLists160 {

//	public class Solution {
//	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//	        Set<ListNode> nodesInB = new HashSet<ListNode>();
//
//	        while (headB != null) {
//	            nodesInB.add(headB);
//	            headB = headB.next;
//	        }
//
//	        while (headA != null) {
//	            // if we find the node pointed to by headA,
//	            // in our set containing nodes of B, then return the node
//	            if (nodesInB.contains(headA)) {
//	                return headA;
//	            }
//	            headA = headA.next;
//	        }
//	        return null;
//	    }
//	}
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
		
	}

	
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    	ListNode pA = headA;
	    	ListNode pB = headB;
	    	while(pA !=pB) {
	    		pA = pA == null ? headB : pA.next;
	    		pB = pB == null ? headA : pB.next;
	    		
	    	}
	    	
	    	return pA;
	    	
	    	}
	    }
}
