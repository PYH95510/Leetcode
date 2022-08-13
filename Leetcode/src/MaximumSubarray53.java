
public class MaximumSubarray53 {

	class Solution {
	    public int maxSubArray(int[] nums) {
	         int currentSum = 0;
	        int maxSum = Integer.MIN_VALUE;
	        
	        for (int i = 0; i < nums.length; i++) {
	            currentSum += nums[i]; //later on, we could use dp array to add data
	            if (currentSum > maxSum) { //comparing current sum and max sum so always max sum has larger value than the current sum
	                maxSum = currentSum;
	            }
	            if (currentSum < 0) {
	                currentSum = 0;
	            }
	        }
	        return maxSum;
	        
	    }
	}

	// time complexity has O(n)
	
	
	/*This is very easy and very basic version of dynamic programming. Even if it is medium level question, to solve this problem, we do not need
	 * serious mathematical concept or algorithm. However, even though it is not using dp array to solve this problem, it is adding up maxsum
	 * if the current number is greater than the currentsum, which is very basic idea that could be used in the future dynamic programming. */
}
