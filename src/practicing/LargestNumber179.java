package practicing;

import java.util.Arrays;

public class LargestNumber179 {

	class Solution {
	    public String largestNumber(int[] nums) {
	        String[] arr = new String[nums.length];
	        int c = 0;
	        for(int i:nums) {
	            arr[c++]=Integer.toString(i);
	        }
	        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
	        if(arr[0].charAt(0)=='0') return "0"; //Edge-case, all given integers are zeroes.
	        StringBuilder sb = new StringBuilder();
	        for(String s:arr) sb.append(s);
	        return sb.toString();
	    }
	}

}

/*Basically, this problem is not that hard to understand or hard to solve. However, I was not that used to solve problems using strings and
 * string builders. Therefore, I brought someone else's codes to give better understanding from here https://leetcode.com/problems/largest-number/discuss/53159/Share-my-fast-JAVA-solution-beat-98.64!
 * To have give brief picture, it is simply changing all the numbers in nums array into string and then comparing the value adding a+b and b+a and
 * adding the bigger one into the string array. After that, using string Builder, appends the result and then return the result using string builder
 * to string method. Here, we should understand the methods and their relations to solve this problem. */
