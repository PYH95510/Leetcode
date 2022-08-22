package practicing;

import java.util.Arrays;

public class UglyNumber2_264 {

	class Solution {
	    public int nthUglyNumber(int n) {
	        if(n==1) return 1;
	        
	        int [] dp = new int[n];
	        
	        
	        //assigning prime each prime numbers to prime array
	        int p2=1, p3=1, p5=1; //assigning p2,p3,p5 for each prime index
	        
	        
	        
	        
	        dp[0] = 0;
	        dp[1] = 1;
	        
	        
	        for(int i = 2; i <dp.length ; i++){
	            int next2 = dp[p2] * 2;
	            int next3 = dp[p3] * 3;
	            int next5 = dp[p5] * 5; //allocating each index in other words, computing each index for each 2,3,5
	            
	            
	            
	        }//first for loop
	        
	        return dp[n];
	        
	        
	    }
	    
	    
	}

}
