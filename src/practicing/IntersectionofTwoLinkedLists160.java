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
/*To solve this problem with o(1) space complexity is not that easy. We have to consider many things to come up with. It is more related to  math I think
 * If we could think that if there is intersection, then if we use two pointers, we could easily solve this problem. Let's think about two List for example.
 * Each has length of 5 and 8. Each intersects at first element for length 5 List. Then if we look into list with length 8, after 3 elements, all of
 * 5 elements will all intersect. All we need is just we need to wait just 3 unnecessary nodes. How so? We can do so by the above. Once the short node's
 * iteration (5 times here) is done, we change it to the longer node's head then the shorter node's head will point to the longer node's head. Longer node's
 * pointer will still pointing the longer node's fifth element. it sill need 3 more to go. So after iterate 3 more, now shorter node's head will now pointing to
 * the intersecting point's head. More formally, T(total) - I(intersect) = L(leftOvers) is what we have. Here it should be 8-5 = 3. So it is more likely to
 * be math problem. :) !*/

