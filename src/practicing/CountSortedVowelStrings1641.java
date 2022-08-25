package practicing;

import java.util.Arrays;

public class CountSortedVowelStrings1641 {

	class Solution {
	    public int countVowelStrings(int n) {
	        int dp [] = new int[6];
	        Arrays.fill(dp, 1);
	        
	        dp[0] = 0;
	        
	        for (int i=1; i<=n; i++) {
	            for (int k=1; k<=5; k++) {
	                dp[k] += dp[k-1];
	            }
	        }
	        
	        return dp[5];
	        
	    }
	    
	    
	}
}
/*This algorithm is more related to math. If we could come up with the idea after writing all the numbers, we do not actually use any of the strings
 At first, I tried to practice using strings but I ended using zero string libraries or anything related to string.*/
 