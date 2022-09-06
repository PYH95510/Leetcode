package practicing;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParentheses241 {

	
	    public static List<Integer> diffWaysToCompute(String input) {
	        List<Integer> res = new ArrayList<Integer>();
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c == '-' || c == '+' || c == '*') {
	                String a = input.substring(0, i);
	                String b = input.substring(i + 1);//substring has two method one with start index and end index and one with just start index if it there is only one with starting index, it returns starts string until end index string
	                List<Integer> al = diffWaysToCompute(a);
	                List<Integer> bl = diffWaysToCompute(b);
	                for (int x : al) {
	                    for (int y : bl) {
	                        if (c == '-') {
	                            res.add(x - y);
	                        } else if (c == '+') {
	                            res.add(x + y);
	                        } else if (c == '*') {
	                            res.add(x * y);
	                        }
	                    }
	                }
	            }
	        }
	        if (res.size() == 0) res.add(Integer.valueOf(input));
	        return res;
	    }
	
	    
	    public static void main(String[] args) {
	    	
	    	String in ="2*3-4*5";
	    	
	    	diffWaysToCompute(in);
	    	
	    }

}
/*I've got this idea from discussion session from Leetcode. https://leetcode.com/problems/different-ways-to-add-parentheses/discuss/66342/Share-a-clean-and-short-JAVA-solution
 * I am not quite used to using strings and recursion yet. I could understand while I was solving this problem I could know. It is slowly adding numbers
 * that are calculated while recursive calls are made. save parts to List al and parts that will be saved to List bl so they will be calculated.*/
