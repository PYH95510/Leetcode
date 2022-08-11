import java.util.Arrays;

public class CombinationSum377 {
	/*Thinking process
	 * 1. We should decide whether it is DP problem or not.
	 * 2. How to decide whether it is DP or not?
	 * 3. If there is array input (it could be int or string) and want to achieve sort of target value or outcome
	 * there is possibility for it to be DP problem.*/
	
	 public int combinationSum4(int[] nums, int target) {
		    
	        int dp[] = new int[target+1];//instantiate dp with target amount +1. BC nums is always greater or eqaul than 1.
	        dp[0]= 1;
	        for(int i=1;i<dp.length;i++){
	           for (int j=0 ; j<nums.length ; j ++){
	                if (nums[j] <= i) dp[i] += dp[i-nums[j]];
	        }
	        
	        
	    }
	    
	   
	   
	   return dp[target];
	    
	    
	    }
}
