package practicing;

import java.util.HashMap;

public class LongestArithmeticSubsequenceofGivenDifference1218 {

	class Solution {
	    public int longestSubsequence(int[] arr, int difference) {
	        if(arr == null || arr.length == 0)return 0;
	        
	        
	        HashMap <Integer,Integer> ans = new HashMap <>();
	        int maxlen = 1;
	        
	        ans.put(arr[0],1);
	        
	        
	        
	        for(int i = 1 ; i <arr.length ; i++){
	            
	            int previousMapValue = ans.getOrDefault(arr[i]-difference , 0); //if there is repetitive value, return the value else return 0
	            
	            ans.put(arr[i] , previousMapValue+1); // add 1 more from previously stored value like we did from dp
	            
	            maxlen = Math.max(maxlen , previousMapValue+1);
	            
	                
	        }
	        
	        
	        return maxlen;
	    }
	    
	}

}
/*From this question, I was trying to solve numbers that comes after i and that makes me so difficult to solve this problem. However, when we try to 
 * solve this problem as other dp problem but not using array instead using map, it becomes so easy to solve. The basic intuition is that we are storing
 * qualified numbers which is arr[i]-difference if there is any to the current map's value otherwise, we just simply add +1. If we do so, later on,
 * arr[i]'s value could refer previously mapped value and then add+1 until we finally reach to the end of the array. This is basically using same
 * idea that we have used from dp. However, I tend to look backward to solve map questions but I should think the other way around.*/
