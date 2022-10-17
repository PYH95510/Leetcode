package practicing;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum239 {

//	class Solution {
//		public int[] maxSlidingWindow(int[] nums, int k) {
//			int n = nums.length;
//			if(n*k == 0) return new int[0];
//			int[] answers = new int[n-k+1];
//			
//			for(int i = 0; i < n-k+1; i++) {//because we are using window, we can reach at the end of the nums array's length n-k+1 every time.
//				int max = Integer.MIN_VALUE;
//				for(int j = i; j <i+k;j++) {// i is the starting point and k is the window size starting from element i element, until the end of i+k element (because we have window size of i+k) here we could know that we are using window k
//					max = Math.max(max, nums[j]);
//				}
//				answers[i] = max;
//			}
//			
//			
//			return answers;
//		}
//	        
//	    
//	}

	//this is one of the basic way to learn how to use sliding window.
//	class Solution {
//		   public int[] maxSlidingWindow(int[] nums, int k) {
//			    if (nums.length == 0) return new int[0];
//		       
//			    Deque<Integer> index = new ArrayDeque<>();
//			    int[] result = new int[nums.length - k + 1];
//		       
//			    for (int i = 0; i < nums.length; i++) {
//				    int n = nums[i];
//				
//				    while (!index.isEmpty() && nums[index.peekLast()] < n) {
//					    index.removeLast(); // if the last element of queue is less than the current element, remove the last indexed element.
//				    }
//		            
//				//discard right-most index of previous window that is outside of the window range
//				if (!index.isEmpty() && index.peekFirst() == i - k) {
//		            //for example fifth index's value is the maximum value, and it was included in the maximum and it is not eliminated until this if condition. Then this i-k will show you whether it is outside of the range
//					index.pop();
//				}
//
//				//add current index to queue
//				index.add(i);
//
//				//skip over the first window until it fills k elements
//				if (i < k - 1) {
//					continue;
//				}
//
//				//head of d contains the max value over the window
//				result[i - k + 1] = nums[index.peekFirst()];
//			}
//		       
//			return result;
//		       
//		    }
//		    
//		}
	class Solution {
	    public int[] maxSlidingWindow(int[] nums, int k) {
	        int n = nums.length;
	        if (n * k == 0) return new int [0];
	        if (k == 1) return nums;
	        
	        int [] left = new int[n];
	        left[0] = nums[0];
	        int [] right = new int[n];
	        right [n-1] = nums[n-1];
	        for(int i = 1; i < n; i++){
	            if(i%k == 0) left[i] = nums[i]; // if i is divisible by window size
	            else left[i] = Math.max(left[i-1],nums[i]);
	            // if i is not divisible by the window size, we get the max value
	            
	            int j = n-i-1; //starting from the right most numbers
	            
	            if((j+1)%k==0)right[j] = nums[j];
	            else right[j] = Math.max(right[j+1],nums[j]);
	            // if i gets bigger, j will gets smaller so the j will be iterated 
	            
	            
	        }
	        
	        int [] output = new int [n-k+1];
	        for(int i = 0 ; i<n-k+1; i++){
	            output[i]= Math.max(left[i+k-1],right[i]);
	        }
	        
	        return output;
	    }
	}
}
/*From the second solution, we have used maxdeque method. We always keep trying to maintain max element at the top of the queue and add the current element
 * at the end of the queue. */
