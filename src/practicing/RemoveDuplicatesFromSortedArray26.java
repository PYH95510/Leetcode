package practicing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray26 {

	class Solution {
	    public int removeDuplicates(int[] nums) {
	        Set <Integer> duplicate = new HashSet<Integer>();
	        
	        for(int i = 0 ; i < nums.length ; i++){
	            if(duplicate.contains(nums[i])){
	                nums[i]=101;
	                
	            }else{
	                duplicate.add(nums[i]);
	            }
	        }
	        
	        Arrays.sort(nums);
	        return duplicate.size();
	    }
	}

}
