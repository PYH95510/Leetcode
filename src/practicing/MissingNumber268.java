package practicing;

public class MissingNumber268 {
	class Solution {
	    public int missingNumber(int[] nums) {
	        int missing = nums.length;
	        for (int i = 0; i < nums.length; i++) {
	            missing ^= i ^ nums[i];
	        }
	        return missing;
	    }
	}
}
