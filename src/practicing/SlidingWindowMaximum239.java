package practicing;

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

}
