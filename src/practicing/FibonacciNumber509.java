package practicing;

public class FibonacciNumber509 {

	class Solution {
	    public int fib(int n) {
	        if(n == 0) return 0;
	        int dp[] = new int[n+1];
	        
	        dp[0] = 0;
	        dp[1] = 1;
	        
	        for(int i =2; i< dp.length ; i++){
	            
	            
	            dp[i]=dp[i-2]+dp[i-1];
	            
	        }
	        
	        return dp[n];
	    }
	}

}
/*Usually Fibonacci sequence is what we learn for the first time when we learn recursion. However, if we do so, it will be very time consuming.
 * The time complexity of it will be O(2^n). The reason for that is because when we draw the process of recursion for Fibonacci sequence, it has
 * tree structure and it will exponentially grow as 2^n times. The space complexity for Fibonacci is O(n). We might think it is O(1) space complexity.
 * However, we are using recursion and that is being said we are using stack memory. Therefore, it is O(n). To reduce the time complexity, we can
 * now use DP. We now save the calculated part to array DP so in the future we do not need to calculated again the already saved values again. */
