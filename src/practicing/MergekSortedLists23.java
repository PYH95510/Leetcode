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
	 
	
	  
		    public ListNode mergeKLists(ListNode[] lists) {
		        Queue<ListNode> heap = new PriorityQueue <ListNode> ((l1,l2)->l1.val-l2.val); //instantiate priority queue using lists and 
		        ListNode head = new ListNode(0), tail = head;
		        
		        for (ListNode node : lists){
		            if (node != null) heap.offer(node);
		        }
		        
		        while (!heap.isEmpty()) {
		            tail.next = heap.poll(); // this will automatically add to head's next as well it is because we first initialize tail = head as well. It is refering the object's address. so if we are changing tail.next's address, then head.next's address will be changed as well. We are adding the result to the tail.next which is head.next. Also, even if we have  already changed tail, we have set head's next to list 1 which is object as well, head's next is referring to it. Therefore, if we are appending to 1's next, it will appending to head's next as well.
		            tail = tail.next; 
		            if (tail.next != null) heap.offer(tail.next);
		            // it is referring new tail's next because we just changed tail to tail.next not the tail.next that we assigned above
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
