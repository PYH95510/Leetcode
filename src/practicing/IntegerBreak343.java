package practicing;

public class IntegerBreak343 {

	class Solution {
	    public int integerBreak(int n) {
	        // first divide the integer n into several pieces that becomes 10 after being added
	        
	        /*dp[n+1]
	        dp[i]
	        */
	        int dp[] = new int [n+1];
	        dp[0] = 1;
	        
	        
	        
	        for(int i = 2 ; i < dp.length ; i++){ //because n is greater or equal than 2
	            for(int j = 1 ; j < i ; j++){
	                dp[i] = Math.max(dp[i], (Math.max(j,dp[j]) * Math.max(i-j,dp[i-j]))); //this is what I have never thought of using two Math.max inside math.max I should consider next time.
	                
	            }
	        }
	        
	        return dp[n];
	        
	    }
	    
	    
	}
	
//	public class Solution {
//	    public int integerBreak(int n) {
//	        if(n == 2)
//	            return 1;
//	        else if(n == 3)
//	            return 2;
//	        else if(n%3 == 0)
//	            return (int)Math.pow(3, n/3);
//	        else if(n%3 == 1)
//	            return 2 * 2 * (int) Math.pow(3, (n - 4) / 3);
//	        else 
//	            return 2 * (int) Math.pow(3, n/3);
//	    }
//	            
//	} MATH SOLUTION

}
/*I was so close to solve dp solution. However, I have never used Math.max inside Math.max so it takes so much time for me to come up with solution
 * This is pretty much similar to other dp problems. We just need to consider how to come up with and fill dp[i]. Other than that is pretty much same
 * For math solution, it is very optimized and it is sometimes hard to come up with. However, if we could come up with this idea, we could amaze the
 * interviewer. For more information, https://leetcode.com/problems/integer-break/discuss/80785/O(log(n))-Time-solution-with-explanation is where I get
 * the math solution. */