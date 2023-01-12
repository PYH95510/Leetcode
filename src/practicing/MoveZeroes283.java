package practicing;

public class MoveZeroes283 {
	class Solution{
		public void moveZeroes(int[] nums) {
			int nonzeroindex =0;
			
			for(int i = 0 ; i<nums.length; i++) {
				if(i != 0) {
					nums[nonzeroindex] = nums[i];
					nonzeroindex++;
				}
				
			}
			while(nonzeroindex<nums.length) {
				nums[nonzeroindex++] = 0;
			}
			
		}
		
	}
	
}


/*This is another typical two pointer problem. I could come up with by myself. First we need nonzeroindex pointer. While we are iterating, whenever
 * we face non zero factor, we add it to nums[nonzeroindex] array. Then, we increment nonzeroindex. After we move all the nonzero indexes to the
 * front, left parts should be filled with zero. Therefore, we iterate with while loop until the nonzeroindex is less than nums.length.
 * We do not need to worry about what if the numbers inside the array overlaps before they are moved forward? One thing that we need to remember
 * is that in the worst case, the index of nonzeroindex and the length of i are equal. The time complexity for this solution is O(n) (linear). 
 * space complexity is O(1) constant*/

