package practicing;

import java.util.Arrays;

public class MajorityElement169 {
	
	public int majorityElement(int[] nums) {
//		Arrays.sort(nums);
//		return nums[nums.length/2];
		
		Integer candidate = null;
		int count = 0;
		
		for(int num : nums) {
			if(count == 0)candidate = num;
			
			count +=(candidate == num)? 1 : -1;
		}
		return candidate;
	}
}
/*There are so many solutions for this problem, above one is quite brilliant and the below one is 
 * what so much optimized one. To begin with the above one, because there is always majority number, when
 * we sort the number, always the number at the half would be the majority number. Even if it is small or large.
 * The below solution, it is easy after we understand. We set the random number which does not become 0. If from
 * the array, that number comes out, we add one, if it is not that number, we take out one. Because it is the
 * majority number, it should be always larger than the one.*/
 