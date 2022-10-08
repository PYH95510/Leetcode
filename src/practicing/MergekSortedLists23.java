package practicing;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergekSortedLists23 {

	
	  
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	    public static ListNode mergeKLists(ListNode[] lists) {
	        Queue<ListNode> heap = new PriorityQueue <ListNode> ((l1,l2)->l1.val-l2.val); //instantiate priority queue using lists and 
	        ListNode head = new ListNode(0), tail = head;
	        
	        for (ListNode node : lists){
	            if (node != null) heap.offer(node);
	        }
	        
	        while (!heap.isEmpty()) {
	            tail.next = heap.poll();
	            tail = tail.next;
	            if (tail.next != null) heap.offer(tail.next);
	        }
	        
	        return head.next;
	    }
	    
	
	    public static void main(String[] args) {
	    	
	    	ListNode[] lis = new ListNode[3] ;
	    	
	    	ListNode first= new ListNode(1);
	    	ListNode second = new ListNode(4);
	    	ListNode third = new ListNode(5);
	    	first.next = second;
	    	second.next = third;
	    	
	    	ListNode fourth = new ListNode(1);
	    	ListNode fifth = new ListNode(3);
	    	ListNode sixth = new ListNode(4);
	    	fourth.next = fifth;
	    	fifth.next = sixth;
	    	
	    	ListNode seventh = new ListNode(2);
	    	ListNode eight = new ListNode(6);
	    	seventh.next = eight;
	    	
	    	lis[0] = first;
	    	lis[1] = fourth;
	    	lis[2] = seventh;
	    			
	    	
	    	
	    	System.out.println(mergeKLists(lis).toString());
	    }
}
