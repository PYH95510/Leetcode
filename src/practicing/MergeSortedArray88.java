package practicing;

import java.util.ArrayDeque;
import java.util.Deque;

public class MergeSortedArray88 {

//	class Solution {
//	    public void merge(int[] nums1, int m, int[] nums2, int n) {
//	        int[] answer = new int[nums1.length];
//	        Deque <Integer> first = new ArrayDeque <Integer>();
//	        Deque <Integer> second = new ArrayDeque <Integer>();
//	        
//	        for(int i = 0 ; i<n; i++){
//	            first.offer(nums1[i]);
//	            second.offer(nums2[i]);
//	        }
//	        
//	        for(int i = 0 ; i<nums1.length; i++){
//	            
//	            if(!first.isEmpty() && first.peek() <= second.peek()){
//	                answer[i] = first.poll();
//	            }else{
//	                answer[i] = second.poll();
//	            }
//	        }
//	        nums1 = answer;
//	        
//	    }
//	    
//	    
//	}
	class Solution {
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int index1 = m-1;
	        int index2 = m-1;
	        
	        
	        
	        //two pointer + one pointer = three pointer
	        for(int i = nums1.length-1 ; 0<=i; i--){
	            if(index2<0)break;
	            
	            if(index1 >= 0 && nums1[index1] > nums2[index2]){
	                nums1[i] =nums1[index1];
	                index1--;
	            }else{
	                nums1[i]=nums2[index2];
	                index2--;
	            }
	            
	        }
	        
	    }
	    
	}

}
/*This is my solution as constraint says it takes m+n time complexity however, it takes n space complexity*/