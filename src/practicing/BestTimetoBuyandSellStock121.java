package practicing;

public class BestTimetoBuyandSellStock121 {

	class Solution {
	    public int maxProfit(int[] prices) {
	        int min = Integer.MAX_VALUE;
	        int profit = 0;
	        
	        for(int i : prices){
	            if(min>i) min = i;
	            
	            if(i-min>0)profit = Math.max(profit,i-min);
	                
	            
	        }
	        
	        return profit;
	        
	    }
	    
	}
}
/*we do not need to consider about first date because it will be assigned same first date's value anyways. 
 * Also, we shouldn't care about days where no profit because of the first date's price, it will be 0 anyways because no value has 
 * been assigned after initialization.*/
