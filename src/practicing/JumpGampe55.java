package practicing;

public class JumpGampe55 {

	class Solution {

		public boolean canJump(int[] nums) {
			int reachable = 0;
			for (int i = 0; i < nums.length; ++i) {
				if (i > reachable)
					return false; // if i is already gone beyond than the reachable amount,
				// there is no reason for us to keep on this algorithm because it means
				// that index i is already gone far away from our reachable distance. Which
				// means,
				// there is possibility for us that 0 is inside the nums[0]. However, even if
				// there is 0
				// in nums[i], i is smaller than our reachable distance, it is still possible
				// for us to
				// finish the algorithm. Therefore, it is not always necessary for us to
				// conclude to
				// false the whole algorithm.
				reachable = Math.max(reachable, i + nums[i]); // every iteration, reachable should be
				// updated with the index i so it will be updated as so because reachable
				// distance from
				// the array gets changed as index from the array has been changed. However, we
				// have to
				// use Math.max because even though we are adding index and nums[i] together, it
				// could be
				// possible that reachable amount of distance could be smaller than the previous
				// reachable
				// amount. We store each reachable amount to the reachable variable.
			}

			return true;
		}

	}
}
/*It was really difficult for me to solve this problem because I thought it was dynamic programming related problem
However, it could be more easily solved when we use greedy algorithm. It is first time for me to be exposed
to greedy algorithm so I had to spend more than 4 hours to go through and understand this problem but it was
really great time and I think there is strong connection between greedy algorithm and dynamic programming
so you could enjoy more if you focus more on what if I use greedy or what if I use dynamic kind of things :)
*/ 
