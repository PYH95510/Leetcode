package practicing;

import java.util.Arrays;

public class CoinChange322 {

	class Solution {
	    public int coinChange(int[] coins, int amount) {
	      
	        int[] dp = new int[amount+1];
	        Arrays.fill(dp , amount);
	        dp[0] = 0;
	        for(int i = 1 ; i< dp.length ; i++) {
	            for( int j = 0 ; j < coins.length ; j ++){
	                if(i>=coins[j]) dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
	            }
	        }
	    
	        
	        return dp[amount] == dp.length ? -1 : dp[amount];
	    }
	   
	}

}
/*This is the most basic type of dynamic programming problem. It is really great to understand basic algorithm and method how to solve dynamic
 * programming so I highly recommend to those who just start studying dynamic programming, take a lot of time and put as much effort as you can
 * to this problem and try to understand top to bottom. It is okay that to understand and solve whole day. It is that much important. Use every
 * method and means to digest. To understand this problem, there are a lot of keys we should know. First, you should fill the array with large
 * number. Here I just arbitrarily fill with dp.length but it could be Integer.MAX_VALUE or whatever you think it is big enough. After that we should
 * initialize array. Then we are going to iterate two for loops */
 