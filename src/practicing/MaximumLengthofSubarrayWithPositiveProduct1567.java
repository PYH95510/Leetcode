package practicing;

public class MaximumLengthofSubarrayWithPositiveProduct1567 {

	class Solution {
	    public int getMaxLen(int[] nums) {
	        // llp = Length of the longest positive subarray
	        int llp = 0;
	        // lln = length of the longest negative subarray
	        int lln = 0;
	        // max length of the positive subarray
	        int max = 0;
	        for (int i = 0; i < nums.length; i++) {
	            // Reset the lengths upon encountering a zero
	            if (nums[i] == 0) {
	                llp = lln = 0;
	            } else if (nums[i] > 0) {
	                // Upon encountering a positive value, increase the length of the positive subarray till now by one
	                llp++;
	                // Increase the length of the negative subarray only if there's a negative product. 
	                // If there are no negative numbers before the current number or if the (i-1)th number is zero, we should not increase this value.
	                if (lln > 0) lln++;
	            } else {
	                // Upon encountering a negative value, the lengths of the positive and negative subarrays need to be swapped.
	                int temp = llp;
	                // If there are no negative numbers before the current number, then llp should be zero. 
	                // so we need an extra check to ensure that
	                llp = (lln > 0 ? lln + 1 : 0);
	                lln = temp + 1;
	            }
	            max = Math.max(max, llp);
	        }
	        return max;
	    }
	}

}
/*https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/discuss/1432928/Java-or-100-faster-or-O(N)-time-and-O(1)-space-or-With-explanation*/