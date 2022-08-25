package practicing;

import java.util.Arrays;

public class MinimumSumofFourDigit2160 {

	class Solution
	{
	    public int minimumSum(int num)
	    {
	        int[] dig = new int[4]; // For each digit
	        int cur = 0;
	        while(num > 0) // Getting each digit
	        {
	            dig[cur++] = num % 10;
	            num /= 10;
	        }
	        Arrays.sort(dig); // Ascending order
	        int num1 = dig[0] * 10 + dig[2]; // 1st and 3rd digit
	        int num2 = dig[1] * 10 + dig[3]; // 2nd and 4th digit
	        return num1 + num2;
	    }
	}

}

/*This problem was pretty straight forward and easy to solve. From 4 digit numbers, to make smallest sum, make 2 each 2digit numbers. Key point here is 10's digit number should be the First and second
 * smallest number and the largest number should be placed after smallest 10's digit and second largest number should be placed after second smallest 10's digit number. If you can come up with that idea,
 * This problem is not that difficult to solve.*/
