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
