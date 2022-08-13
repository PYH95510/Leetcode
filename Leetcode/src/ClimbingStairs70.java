
public class ClimbingStairs70 {

	class Solution {
	    public int climbStairs(int n) {
	    
	        if(n == 1) return 1;
	    
	        int stepOne = 1, stepTwo = 2; //instantiate step one and step two as 2 respectively because if there are two stairs, there should be more than one possible way
	        
	        int result = 0;
	        for( int i = 3 ; i <= n ; i ++) {
	            result = stepOne+stepTwo; //dp[i-1] is result and dp[-2] is step two
	            stepOne=stepTwo;// save the step Two's value to step One
	            stepTwo=result; // save the result's value to stepOne not to start over again 
	            
	        } 
	      return result; 
	        
	    }   
	        
	    
	    
	}
		/*Another easy dynamic programming problem. If you are someone who just starts studying dynamic programming, I highly recommend to solve Maximum subarray first and then come to this question.
		 *To do so, it will gradually increase your knowledge and enlighten you. As problem description said, we can only walk 1 or 2 steps at a time. Therefore, we initialize step 1 and 2 first.
		 *After we initialize them, we start i with 2 and then, result should be step 1 + step 2 because it should be combinations of step 1 and step 2. If i becomes 3 (which means there are 3 stairs)
		 *To calculate the new value we only leverage the previous two values. So we don't need to use an array to store all the previous values. For better picture, below is the dp program that we usually
		 *used.*/
}




/*class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] =  2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}*/
