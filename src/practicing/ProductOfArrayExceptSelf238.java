package practicing;

public class ProductOfArrayExceptSelf238 {

	class Solution {
		   public int[] productExceptSelf(int[] nums) {
		    int[] result = new int[nums.length];
		    for (int i = 0, tmp = 1; i < nums.length; i++) {
		        result[i] = tmp;
		        tmp *= nums[i]; // tmp is multiplied to the next element. which means it is not always multiplied to itself. and nums[i] is stored to value tmp. 
		    }
		    for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
		        result[i] *= tmp;
		        tmp *= nums[i]; //from here tmp multiplies scarce values by using tmp
		        // from first for loop last element has all the values  whereas right infront of the value from the last has lack of one value and infront of that value has lack of 2 valeus and so on...
		    }
		        
		        
		            //if we use nested for-loop, it will be solved easily. However, we cannot use nested for loop. then what about recursion ? - it will be O(n^2) too
		        
		        // if we can use division, using for loop, multiply every element and add each element to array and divide i'th element when adding i'th element. Maybe 2 for loops ?
		           
		        
		        
		        return result;
		    }
		    
		    //O(n) solution
		    
		    
		  
		    
		    
		        
		}

}
