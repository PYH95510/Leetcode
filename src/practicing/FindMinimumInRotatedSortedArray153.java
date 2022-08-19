package practicing;

public class FindMinimumInRotatedSortedArray153 {

	class Solution {
	    public int findMin(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }
	        
	        int left =0;
	        int right = nums.length-1;
	        
	        
	        int min = Integer.MIN_VALUE;
	        
	        while(left < right){
	            
	            int middle=left+(right-left)/2;
	            
	            if(nums[right] > nums[middle]){ //if right end is bigger than the middle , it is not rotated
	                right=middle;
	               
	                
	            }else{ // if it is not, it is rotated or rotated 7 times right < left
	                
	                
	               left = middle+1;
	                
	            }
	                
	            
	        }
	            
	        return nums[left];
	    }
	}

}

/*To solve these types of problems, it is usually safe to compare and observe middle values not the starting and end points. I have got the wrong answer
 * trying to compare left point value in the if statement. However, there is possibility that starting and endpoint could be wrong so if you are
 * not 100 percent sure with it, try to compare middle point. other than that, this problem is pretty much basic math problem. The problem's constrain
 * it self rather giving us hint. We are supposed to solve this problem within O(logn) time complexity which means if we could solve this problem
 * using binary search it would be easier for us to fit in to that constraint. Therefore, using binary search and then solve this problem as so.*/
