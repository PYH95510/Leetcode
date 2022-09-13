package practicing;

public class FlipStringtoMonotoneIncreasing926 {

	class Solution {
	    public int minFlipsMonoIncr(String s) {
	        int flip = 0;
	        int ones = 0;
	        
	        
	        for(int i = 0 ; i<s.length(); i++){
	            if(s.charAt(i)=='1')
	                ones++;
	            else
	                flip++;
	            
	            flip = Math.min(ones,flip);
	        }
	        
	        return flip;
	        
	    }
	}

}
/*This question is very straight forward and very understandable. We need to find how many 0s before index and how many 1s before index and add
 * respectively and find the min to return as question asked us to do so. It doesn't matter which one comes either 0 or 1. Because we can change it
 * to either one. Also what I was having trouble was 00110 and it solved because of Math.min(ones,flip) because we are using Math.min function, before
 * we meet 1, we are not using 1 at all which means we keep 1's value as 0 and we are abandoning 0's value because we are assigning every new value
 * to 0. However, we keep 1's value to ones so if one comes first like 11001, we keep it to ones. So the outcome becomes different.*/
