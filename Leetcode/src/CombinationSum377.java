import java.util.Arrays;

public class CombinationSum377 {
	/*Thinking process
	 * 1. We should decide whether it is DP problem or not.
	 * 2. How to decide whether it is DP or not?
	 * 3. If there is array input (it could be int or string) and want to achieve sort of target value or outcome
	 * there is possibility for it to be DP problem.*/
	
	 public int combinationSum4(int[] nums, int target) {
		    
	        int dp[] = new int[target+1];//instantiate dp with target amount +1. BC nums is always greater or eqaul than 1.
	        dp[0]= 1; //Think it as a basic case
	        //Better to think it as math problem when we solve dynamic programming
	        for(int i=1;i<dp.length;i++){ 
	           for (int j=0 ; j<nums.length ; j ++){
	                if (nums[j] <= i) dp[i] += dp[i-nums[j]]; // This is very similar to coin change problem
	                
	                // when you write if statement, just write it accordingly to dp[i - nums[j]]. try to 
	                // avoid out of index boundary error
	                
	                //However, we don't need to find minimum value. We need to find different combination
	                //Therefore, if you find any, add that amount to dp[i] and then find the rest's combination
	                //Forexample if we want to find target 7, dp[i] is 7 and num[i] is 4 then we need to find 3 so we should
	                //Find 7-4 so it should be 4-3 and then find the rest.
	                
	                
	                /*So, to be more acutely, because it has for loop, we are trying to find combinations of each numbers, if we are looking for target number
	                 * 14, dp[14], combination of 14 is by for loop, and in the nums, is equals to dp[14 - each numbers in nums]. The reason that dp[0] =1 is because
	                 * there is only one combination that makes 0 is 0 itself. */
	        }
	        
	        
	    }
	    
	   
	   
	   return dp[target];
	    
	    
	    }
}
