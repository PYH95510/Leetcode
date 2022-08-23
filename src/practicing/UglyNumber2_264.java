package practicing;

import java.util.Arrays;

public class UglyNumber2_264 {

	class Solution {
	    public int nthUglyNumber(int n) {
	        if(n==1) return 1;
	        
	        int [] dp = new int[n+1];
	        
	        
	        //assigning prime each prime numbers to prime array

	        
	        dp[0] = 0;
	        dp[1] = 1;
	        int p2 = 1 , p3 = 1 , p5 = 1;
	        
	        for(int i = 2; i <dp.length ; i++){
	            int next2 = dp[p2] * 2;
	            int next3 = dp[p3] * 3;
	            int next5 = dp[p5] * 5; //allocating each index in other words, computing each index for each 2,3,5
	            
	            int ans = Math.min(next2,Math.min(next3,next5));//finding min num for 3 values
	            
	            dp[i] = ans;
	            
	            if(ans == next2) p2++;
	            if(ans == next3) p3++;
	            if(ans == next5) p5++;
	            
	            
	            
	            
	        }//first for loop
	        
	        return dp[n];
	        
	        
	    }
	    
	    
	}

}
/*This dynamic programming was totally different from the dynamic programming that I have done from previous dp problems. I had to come up with
 * different ideas and also, I had to expand my idea that dp's equation does not need to be limited into one line. Also, for three numbers to be
 * used in Math.min, it should be written above. It took to much time for me to figure them out. However, besides that, it was not that difficult
 * to understand the algorithm itself.
 * We initially allocate 1 *each prime number to each index and then find math.min index. After that, if it is minimum number, we increase the index
 * and then multiply the right factor (2or3or5 accordingly) and add it to dp[i]. That is pretty much all for this problem.  */
