package practicing;

public class JumpGamell45 {

	class Solution {
	    public int jump(int[] nums) {
	        int jumps = 0, end = 0, Farthest = nums[0];
	        
	        for ( int index = 0; index + 1 < nums.length; ++index ) {
	            Farthest = Math.max(index + nums[index], Farthest); //like we did from last, this is the farthest we can get
	            if ( index == end ) { //do not jumps until we get the farthest.
	                ++jumps;
	                end = Farthest;
	            }
	        }
	        return jumps;
	    }
	}
}

/*
 * To be honest, I just jumped into this problem because I thought this would be
 * pretty easy to solve. However, even though this problem has a lot of things in common with the previous jump game1
 * It is really hard to come up with the idea that index==end to optimize the solution to O(n) time complexity
 * and then update end with Farthest. It is not always to come up with those simple ideas so let's try :)
 * To have a better understanding, we threshold index with the variable end so we do not count jumps until it meets
 * end.
 */
