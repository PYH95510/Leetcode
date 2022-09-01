package practicing;

public class PredicttheWinner486 {

//	public class Solution {
//	    public boolean PredictTheWinner(int[] nums) {
//	          int[][] dp = new int[nums.length][nums.length];
//	        for (int i = 0; i < nums.length; i++) {
//	            dp[i][i] = nums[i];
//	        }
//	        
//	        for (int i = nums.length - 2; i >= 0; i--) {
//	            for (int j = i + 1; j < nums.length; j++) {
//	                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
//	            }//checking numbers from the end, adding which number is bigger either adding from end or adding from 
//	        }        
//	        return dp[0][nums.length - 1] >= 0;
//	    }
//	}
	
	    public static boolean PredictTheWinner(int[] nums) {
	        return getMaxScore(nums,0,nums.length-1) >= 0;
	    }
	  
	    private static int getMaxScore(int[] nums, int s, int e){
	        if (s == e)
	            return nums[s];
	 
	    
	        int first = nums[s] - getMaxScore(nums,s+1,e);
	        int last = nums[e] - getMaxScore(nums,s,e-1);
	        
	        return Math.max(first,last);
	    }
	
	
	public static void main(String[] args) {
		int[] num1 = new int[5];
		num1[0] = 1;
		num1[1] = 1;
		num1[2] = 27;
		num1[3] = 1;
		num1[4] = 1;
		boolean result;
		result =PredictTheWinner(num1);
		
	}


	

}

/*Both recursion version and using dp version is added, trying to use 2d dp version but still studying*/
