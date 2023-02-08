package practicing;

public class ReverseString344 {
	class Solution {
		public void reverseString(char[] s) {
			int left = 0, right = s.length - 1;

			while (left < right) {
				char tmt = s[left];
				s[left++] = s[right];
				s[right++] = tmt;

			}

		}

	}

}
/*Reverse string is very easy. However, the tricky part was in place. You should solve this problem in place with O(1) constant extra memory space
 * In place means an algorithm which transforms input using no auxiliary data structure. That's being said, we should change the input s. Solving
 * using only O(1) space is not that difficult and hard to come up with. We just need to use two pointers and that is it. When right and left becomes
 * one apart, we terminate the while loop.*/
