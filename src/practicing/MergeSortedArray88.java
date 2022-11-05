package practicing;

import java.util.ArrayDeque;
import java.util.Deque;

public class MergeSortedArray88 {

	class Solution {
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] answer = new int[nums1.length];
	        Deque <Integer> first = new ArrayDeque <Integer>();
	        Deque <Integer> second = new ArrayDeque <Integer>();
	        
	        for(int i = 0 ; i<n; i++){
	            first.offer(nums1[i]);
	            second.offer(nums2[i]);
	        }
	        
	        for(int i = 0 ; i<nums1.length; i++){
	            
	            if(!first.isEmpty() && first.peek() <= second.peek()){
	                answer[i] = first.poll();
	            }else{
	                answer[i] = second.poll();
	            }
	        }
	        nums1 = answer;
	        
	    }
	    
	    
	}

}
