package practicing;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParentheses241 {

	public class Solution {
	    public List<Integer> diffWaysToCompute(String input) {
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
	}

}
