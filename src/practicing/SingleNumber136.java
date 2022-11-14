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

//linear runtime, constant extra space which means I cannot use hashmap or set
// linear runtime means o(n) so at most o(n)
/*The ^ is a bitwise XOR operator. It works like this:
00010 ^ 00010 = 00000;
00000 ^ 10101 = 10101;
In other words, if two integers of the same value (and bit representation) are XORed together, the expression evaluates to all 0s. If a number is XORed with all 0s, the expression evaluates to the number itself. These are both properties of the XOR function.
XORing the entire array together will eliminate all the duplicates (they will all be set to 0) and leave only the single number. However, it doesn't work with two single Numbers*/