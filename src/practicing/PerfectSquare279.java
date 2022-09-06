package practicing;

import java.util.Arrays;

public class PerfectSquare279 {

	class Solution {
	    public int numSquares(int n) {
	        int[] dp = new int[n+1];
	       
	       Arrays.fill(dp, Integer.MAX_VALUE);
	       dp[0] = 0;
	        
	       for(int i=1; i<=n; i++){
	               
	           for(int j=1; j<=Math.sqrt(i); j++){
	               dp[i] = Math.min(dp[i], (dp[i-(j*j)]+1));
	           }    
	       } 
	        
	        return dp[n];
	    }
	    
	}

}
/*I was a little depressed while I was solving this problem. I was pretty confidence when I saw this problem because I was quite sure that I could
 * solve this problem without any help but it ended up I looked up discussion part. I feel like sometimes things does not go well as I think
 *There are two things that we should consider. One is the for loop's arrange (nested one) it is supposed to be Math.sqrt(i). It does not have to
 *be math function. We could just simply use variable that we assign. Anyways, it should be square root of i because j shouldn't be iterated more than
 *i. For example, if i is 9, we should find the value inside j is less than 3 combination. either 3*3 or numbers all combined with 1 or let's say there
 *is 8. Square root of 8 is less than 3 and greater than 2. So it should be combined with numbers of 1 or 2. 2*2 is 4 so dp[4] should be added again
 *and if it is added again, we should add +1. It is exactly how dp work and we have seen before. */

