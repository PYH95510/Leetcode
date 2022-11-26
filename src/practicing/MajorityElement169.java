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
