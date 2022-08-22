package practicing;

import java.util.Arrays;

public class UglyNumber2_264 {

	class Solution {
	    public int nthUglyNumber(int n) {
	        if(n==1) return 1;
	        
	        int [] dp = new int[n+1];
	        int [] prime = new int[3];
	        prime[0] = 2;
	        prime[1] = 3;
	        prime[2] = 5;
	        //assigning prime each prime numbers to prime array

	        Arrays.fill(dp, Integer.MAX_VALUE);
	        
	        dp[0] = 0;
	        dp[1] = 1;
	        
	        for(int i = 2; i <dp.length ; i++){
	            for(int j = 0 ; j < prime.length; j++){
	                if(i>prime[j]){
	                    
	                    dp[i] = Math.min(dp[i],dp[i-1]+prime[j]);
	                    
	                    
	                }//dp starts if statement
	            }//second for loop
	            
	            
	        }//first for loop
	        
	        return dp[n];
	        
	        
	    }
	    
	    
	}

}
