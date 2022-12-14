package practicing;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
	class Solution {

	    private int getNext(int n) {
	        int totalSum = 0;
	        while (n > 0) {
	            int d = n % 10;
	            n = n / 10;
	            totalSum += d * d;
	        }
	        return totalSum;
	    }

	    public boolean isHappy(int n) {
	        Set<Integer> seen = new HashSet<>();
	        while (n != 1 && !seen.contains(n)) {
	            seen.add(n);
	            n = getNext(n);
	        }
	        return n == 1;
	    }
	}
}

/*this is pretty easy when we are using hash set and set. When we have seen that number before, we can just add that number to Set and then move
 * on to the next number that we have not seen.*/
