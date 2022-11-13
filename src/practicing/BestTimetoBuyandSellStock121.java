package practicing;

public class BestTimetoBuyandSellStock121 {

	class Solution {
	    public int maxProfit(int[] prices) {
	        int min=prices[0];
	        int max=0;
	        for(int price:prices){
	            min=Math.min(min,price);
	            max=Math.max(max,price-min);
	        }
	        return max;
	    }
	}
//	class Solution {
//	    public int maxProfit(int[] prices) {
//	        int min = Integer.MAX_VALUE;
//	        int profit = 0;
//	        
//	        for(int i : prices){
//	            if(min>i) min = i;
//	            
//	            if(i-min>0)profit = Math.max(profit,i-min);
//	                
//	            
//	        }
//	        
//	        return profit;
//	        
//	    }
//	    
//	}
//	class Solution {
//	    public int maxProfit(int[] prices) {
//	        int buy = prices[0];
//	        int max = 0;
//	        
//	        for(int i =1;i<prices.length;i++){
//	            int tmt = prices[i] - buy;
//	            
//	            if(max < tmt) max = tmt;
//	            
//	            if(buy > prices[i]){
//	                buy = prices[i];
//	            }
//	            
//	            if(max < 0) max = 0;
//	        }
//	        
//	        return max;
//	    }
//	}
}
/*we do not need to consider about first date because it will be assigned same first date's value anyways. 
 * Also, we shouldn't care about days where no profit because of the first date's price, it will be 0 anyways because no value has 
 * been assigned after initialization.*/

/*I added two pointer solution*/