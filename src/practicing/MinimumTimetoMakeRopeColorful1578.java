package practicing;

public class MinimumTimetoMakeRopeColorful1578 {

	class Solution {
	    public int minCost(String s, int[] cost) {
	        int n = s.length();
	        int result = 0;
	        for (int i=1; i<n; i++) {
	            if (s.charAt(i) == s.charAt(i-1)) {
	                result = result + Math.min(cost[i], cost[i-1]);
	                cost[i] = Math.max(cost[i], cost[i-1]);
	            }
	        }
	        return result;
	    }
	}

}
/*It was really hard for me to come up with my own solution for this problem so I would like to share soluton from leet code discussion session
 * https://leetcode.com/problems/minimum-time-to-make-rope-colorful/discuss/841690/My-Java-Solution-O(n) it is originated from here. The author first
 * Instantiate needed variables. and then update result when we face same character from the string s. After that, the author add minimum value to the
 * result variable and then update the cost with the maximum value because we no longer have the minimum cost because we took it out from the cost
 * array. I was thinking about same solution but because I misunderstood the question, I failed to come up with the solution so there is possiblity
 * for people who loop up my diary so I would like to someone else's solution! */

