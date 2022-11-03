package practicing;

public class PlusOne66 {

	class Solution{
		public int[] plusOne(int[] digits) {
			int len = digits.length;
			for(int index = len-1 ; 0<= index ; index--) {
				if(digits[index] == 9) {
					digits[index] = 0;
				}else {
					digits[index]++;
					return digits; // if digits is not 99, 9 which means there is no carry bit it will return digit and just increment
						// also it is just 19 or 119 it will just increment one because i th digit is incremented. If it is satisfied, then it will returned here
				}
			}
			
			digits = new int[len+1];
			digits[0] = 1; // because it is incremented 1 because of the carry bit
			return digits;
			
		}
	}

}
