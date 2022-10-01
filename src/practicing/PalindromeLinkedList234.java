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
	  
//	  class Solution {
//
//		    private ListNode frontPointer;
//
//		    private boolean recursivelyCheck(ListNode currentNode) {
//		        if (currentNode != null) {
//		            if (!recursivelyCheck(currentNode.next)) return false;
//		            if (currentNode.val != frontPointer.val) return false;
//		            frontPointer = frontPointer.next;
//		        }
//		        return true;
//		    }
//
//		    public boolean isPalindrome(ListNode head) {
//		        frontPointer = head;
//		        return recursivelyCheck(head);
//		    }
//		}
	  

	  class Solution {

		    public boolean isPalindrome(ListNode head) {
		        if (head == null) return true;
		        
		        ListNode firstHalfEnd = endOfFirstHalf(head); //getting first half
		        ListNode secondHalfStart = reverseList(firstHalfEnd.next);// reverse first half's next node
		        
		        ListNode p1 = head;
		        ListNode p2 = secondHalfStart;
		        boolean result = true;
		        
		        //checking whether or not there is a palindrome.
		        while(result && p2 != null){
		            if (p1.val != p2.val) result = false;
		            p1 = p1.next;
		            p2 = p2.next;
		        }
		        
		        //restore the list and return the result.
		        firstHalfEnd.next = reverseList(secondHalfStart);
		        return result;
		        
		    }
		    
		    
		    private ListNode reverseList (ListNode head){
		        ListNode prev = null;
		        ListNode curr = head;
		        
		        while( curr != null){
		            ListNode nextTemp = curr.next; //cutting rest of nodes and save them to next tmt
		            curr.next = prev; // link saved nodes (inverse nodes so far)
		            prev = curr; // save the inverse sequence to previous
		            curr = nextTemp; //move on to next nodes until it is done
		        }
		        
		        return prev;
		        
		    }
		    
		    private ListNode endOfFirstHalf (ListNode head){
		        ListNode fast = head;
		        ListNode slow = head;
		        while(fast.next != null && fast.next.next != null){
		            fast= fast.next.next;
		            slow =slow.next;
		        }
		        return slow;
		        
		        
		    }
		    
		    
		    
		}
	  
}
