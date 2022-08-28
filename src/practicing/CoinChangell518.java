package practicing;

public class CoinChangell518 {
//try to solve it using dp technique.
	
	class Solution {
	    public int change(int amount, int[] coins) {
	        int dp [] = new int [amount+1];
	    
	        dp[0] = 1;
	        
	        
	        for(int coin : coins){ //Here comes difference of for each statement and for loop. From for each statement, coin's value is coins's first
	        	//value here from the problem it should be 1 and then it will be changed to 2 an then 5 whereas for loop it is simply 1,2,3
	        	
	            for(int n =coin; n<= amount ; n++){
	                dp[n] += dp[n-coin];
	            }
	        }
	        
	        return dp[amount];
	    }
	    
	    
	}

}
/*For this question, it was kind of hard for me to understand the difference between for loop and for each statement. Even though they are iterating similarly,
 *from for each statement, while iterate, the variable itself has the value. Let's say the array's value is [1,2,5]. If we are using just for loop with
 *for(int i =0 ; i < arr.length ; i++) the i would simply goes 0,1,2 and if we are to use i's value inside the for loop, the i's value would simply be 0,1,2
 *However, in for-each statement, if we are using for(int i : arr) i would be 1,2,5 when we are using i's value inside the for loop, even though it will
 *be iterated 3 times like wise it is done so as for loop. Other than that, to understand this problem, we are using coins first unlike other dp
 *problems. Here, we are using coins first. By using coins' values, if we can reach to that value by using the coin, we add it to dp[n]. How do we
 *know that? It is simple, as usual, we use dp's index as value. Here n is index. We do not need to worry about whether n is less than coin because
 *we are using for-each statement so coin is always starting as one of coins' value. */
 