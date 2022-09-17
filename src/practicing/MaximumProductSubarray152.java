package practicing;

public class MaximumProductSubarray152 {

	class Solution {
		public int maxProduct(int[] nums) {

			int max = nums[0], min = nums[0], ans = nums[0];

			for (int i = 1; i < nums.length; i++) {

				int tmt = max;
				max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
				min = Math.min(Math.min(tmt * nums[i], min * nums[i]), nums[i]);

				if (max > ans)
					ans = max;

			}

			return ans;

		}

	}

}
/*
 * From this problem, we should have the skill that how to get rid of previous values and then move on to next values from the array. From here it is
 * done by assigning max new values every time. If we encounters minus, just multiply it to the max and then using Math.max function, we could easily
 * pick either the nums[i] or min value. However, most of the time, if nums[i] itself is minus(not multiplied by previous minus value yet) Math.max
 * will choose nums[i] newly and then move on to next number until finds non-negative number from nums[i] and then if it finds one, multiply again until
 * encounters another minus value from the array. We should not worry about the minus value that we abandoned from max becomes maximum value later by
 * multiplying two minus. It is because those values are stored in min variable.*/
