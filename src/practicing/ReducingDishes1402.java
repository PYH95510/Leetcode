package practicing;

import java.util.Arrays;

public class ReducingDishes1402 {

	class Solution {
	    public int maxSatisfaction(int[] satisfaction) {
	        int total = 0,res = 0;
	        Arrays.sort(satisfaction);
	        
	        for(int i = satisfaction.length-1;i >= 0 && satisfaction[i] > -total;i--){
	            total += satisfaction[i]; //total + satisfaction[i]
	            res += total; //res + total
	        }
	        return res;


	    }
	    
	    
	}

}
/*I have spent almost a day to solve this problem which was a first difficult problem for me and at the end I gave up and looked up someone
 * else's solution. But one good thing was it did not take too much time for me to understand. So basically, this question is we need to understand that 
 * after we sort the array, by adding the array inversely, we could add them like we multiply them. For example, if we have to multiply biggest number
 * the most then we just need to add the biggest number the most because multiply simply means how many time we added them. Also, we compute the
 * for loop until satisfaction[i] itself is less than -total because each iteration inside the for loop we add all the numbers before that number
 * so even if we encounters negative number from certain satisfaction[i], it is added to total (which is kind of similar to dp) and if it is not
 * bigger than the total, still customer's total satisfaction is added so we keep moving to the next ith number.*/
 