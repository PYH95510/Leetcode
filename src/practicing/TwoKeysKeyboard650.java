package practicing;

public class TwoKeysKeyboard650 {

	class Solution {
	    public int minSteps(int n) {
	        
	        
	        int numbers = 2; //it should start with two otherwise first if statement inside the while loop will continuously go wrong.
	        
	        int steps = 0;
	        
	        while(n>1){
	            
	            while(n%numbers == 0){
	                steps += numbers;
	                n /= numbers;
	            }
	            numbers++;
	        }
	        
	        return steps;
	        
	        
	    }
	    
	}

}
/*This problem was not so easy to solve to solve with math concept. It derived from prime factorization. Let's say we have Certain number of A pasted.
 * To get those numbers of As, we should paste several times. If any of that number is composite, say, g_i (here n = g_1*g_2*g_3*g_4 etc) , g_i could be
 * expressed as p*q. Each p and q could be expressed as one copy *p-1 and one copy*p-1. If we are calculating it into math, we need p+q moves to make
 * pq. For example, to calculate 8, the answer is 6, here we could know 4+2 step is what we need. It is so clear that pq -p-q-1>=1 is prime factorization
 * that we can get from this problem. */

