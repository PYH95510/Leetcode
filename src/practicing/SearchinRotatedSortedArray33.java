package practicing;

public class SearchinRotatedSortedArray33 {

	class Solution {
	    public int search(int[] nums, int target) {
	       int low = 0;
	      int high = nums.length - 1;
	      while(low < high)
	      {
	        int mid = (low + high) / 2;
	        if(nums[mid] == target)
	          return mid;
	        
	        if(nums[low] <= nums[mid]) {       // left part of the array is sorted
	          if(target >= nums[low] && target < nums[mid]) // it is in between the left side.
	            high = mid - 1;
	          else
	            low = mid + 1;
	            
	        }else {
	            
	            // right part of the array is sorted    
	           if(target <= nums[high] && target > nums[mid]) // it is in between the right side.
	             low = mid + 1;
	          else
	            high = mid - 1; 
	        }                        
	          
	      }
	       return nums[low] == target ? low : -1 ; //low part is the answer. Because always rotated from low part first.
	    }
	}

}
