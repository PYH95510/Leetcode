package practicing;

public class LemonadeChange860 {

	class Solution {
	    public boolean lemonadeChange(int[] bills) {
	        int five = 0;
	        int ten = 0;
	        if (bills.length < 1) return true;
	        if (bills[0] != 5) return false;
	            
	        for(int i = 0 ; i<bills.length ; i++){
	           if (bills[i] == 5) 
	                five++;
	            else if (bills[i] == 10) {
	                if (five < 1)
	                    return false;
	                five--;
	                ten++;
	            } else {
	                if (ten > 0 && five > 0) {
	                    ten--;
	                    five--;
	                } else if (five > 2) 
	                    five -= 3;
	                else return false;
	            }
	            
	        }
	        
	        return true;
	        
	    }
	}

}
/*I guess this is one of the most simple greedy algorithm question from leetcode. To solve this problem
 * we just need to use simple if and else statement and one for loop. Time complexity for this problem should
 * be O(n) and space complexity would be o(bills). At first, I thought I might use HashMap but it would take
 * too much space complexity whereas in this situation, we could use constant space. If I use hashmap, I might use
 * map.put(key, map.getOrDefault(key, 0)+1); However, if I use this, it might be more time consuming and the code
 * would be more difficult. Also it would consume more space. To reduce them increasingly and optimize them
 * accordingly, this is one of the great solutions. */
