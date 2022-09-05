package practicing;

public class GreatestSumDivisiblebyThree1262 {

	class Solution {
	    public int maxSumDivThree(int[] nums) {
	        int sum = 0;
	        int oneRemainder = 20000;
	        int twoRemainder = 20000;
	        
	        for(int num : nums)
	        {
	            sum += num;
	            
	            if(num % 3 == 1)
	            {
	                twoRemainder = Math.min(twoRemainder, oneRemainder + num);
	                oneRemainder = Math.min(oneRemainder, num); 
	            }
	            
	            if(num % 3 == 2)
	            {
	                oneRemainder = Math.min(oneRemainder, twoRemainder + num);
	                twoRemainder = Math.min(twoRemainder, num);
	                 
	            }
	        }
	        
	        if(sum % 3 == 0)
	            return sum;
	        
	        if(sum % 3 == 1)
	            return sum - oneRemainder;
	        
	        if(sum % 3 == 2)
	            return sum - twoRemainder;
	        
	        return 0;
	            
	    }
	}

}
/*While I was trying to solve this problem, I found out that this problem was kind of waste of time. This problem could be easily solved. We do not actually
 * need serious algorithmic thoughts or coding skills. All we need is just divide every numbers into case by case situations and then subtract them 
 * from the total sum from minimum number. That was it. */
