package practicing;

public class PredicttheWinner486 {

	public class Solution {
	    public boolean PredictTheWinner(int[] nums) {
	          int[][] dp = new int[nums.length][nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            dp[i][i] = nums[i];
	        }
	        
	        for (int i = nums.length - 2; i >= 0; i--) {
	            for (int j = i + 1; j < nums.length; j++) {
	                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
	            }//checking numbers from the end, adding which number is bigger either adding from end or adding from 
	        }        
	        return dp[0][nums.length - 1] >= 0;
	    }
	}

}
