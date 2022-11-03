package practicing;

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;

public class RemoveDuplicatesFromSortedArray26 {

//	  public int removeDuplicates(int[] nums) {
//	        Set <Integer> duplicate = new HashSet<Integer>();
//	        
//	        for(int i = 0 ; i < nums.length ; i++){
//	            if(duplicate.contains(nums[i])){
//	                nums[i]=101;
//	                
//	            }else{
//	                duplicate.add(nums[i]);
//	            }
//	        }
//	        
//	        Arrays.sort(nums);
//	        return duplicate.size();
//	    }

	  class Solution{
		  public int removeDuplicates(int[] nums) {
			  int insertindex = 0 , lookupindex = 1 ;
			  while(lookupindex < nums.length) {
				  if(nums[insertindex] != nums[lookupindex]) { //first contains the index
					  insertindex++;
					  nums[insertindex] = nums[lookupindex];
					  lookupindex++;
				  }
					 
				  else {
					  lookupindex++;
				  }
			  }
			  
			  return insertindex+1; //because up to first is valid index so we have to return insertindex+1 to get invalid indexes which means
			  // if insert index is 4, it means 5 numbers are inserted so we are supposed to have 5 numbers.
			  
		  }
	  }
	  
}
/*The commented section is my original first solution. However, it is not optimized. It takes o(nlogn) time complexity and o(n). Below is the optimized
 * Two pointer used solution. The basic of two pointer is so important and we could know so well from this problem. Two pointer is basically two index
 * that we allocate. After we allocate two index, they move differently. Usually, one has important index and the other one has usually searching for 
 * the index that we need. We should fully understand this problem this problem.*/
