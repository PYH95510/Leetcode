package practicing;

public class SingleNumber136 {

	public int singleNumber(int[] nums) {
		int result = 0;
		for(int num : nums) {
			result ^= num;
		}
		return result;
	}
}
