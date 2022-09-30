package practicing;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList234 {

	
	  //Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
//	class Solution {
//	    public boolean isPalindrome(ListNode head) {
//	        
//	        List <Integer> vals = new ArrayList <Integer>();
//	        
//	        ListNode currentNode = head;
//	        
//	        while(currentNode != null){
//	            vals.add(currentNode.val);
//	            currentNode = currentNode.next;
//	        }
//	        
//	        int front = 0;
//	        int back = vals.size()-1;
//	        
//	        while (front < back){
//	            if (!vals.get(front).equals(vals.get(back))){
//	                return false;
//	            }
//	            front ++;
//	            back --;
//	        }
//	        
//	        return true;
//	    }
//	    
//	    
//	}
	  
	  class Solution {

		    private ListNode frontPointer;

		    private boolean recursivelyCheck(ListNode currentNode) {
		        if (currentNode != null) {
		            if (!recursivelyCheck(currentNode.next)) return false;
		            if (currentNode.val != frontPointer.val) return false;
		            frontPointer = frontPointer.next;
		        }
		        return true;
		    }

		    public boolean isPalindrome(ListNode head) {
		        frontPointer = head;
		        return recursivelyCheck(head);
		    }
		}

}
