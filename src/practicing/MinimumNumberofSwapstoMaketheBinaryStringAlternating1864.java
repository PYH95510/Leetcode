package practicing;

public class MinimumNumberofSwapstoMaketheBinaryStringAlternating1864 {

	class Solution {
	    public int minSwaps(String s) {
	        int one=0,zero=0;
	        for(char ch : s.toCharArray()){
	            if(ch == '1')   one++;
	            else zero++;
	        }
	        if(Math.abs(one-zero) > 1)
	            return -1;
	           
	        // for odd number, if 1 is more than 0, then it is inevitably placed in even position, the other way is same 
	        if(one > zero)
	            return replace(s.toCharArray(),'1');
	        else if(zero > one)
	            return replace(s.toCharArray(),'0');
	        //else for odd number, just swap for both and then get the min number from either one.
	        else
	            return Math.min(replace(s.toCharArray(),'1'),replace(s.toCharArray(),'0'));
	    }
	    
	    public int replace(char[] s, char symbol){
	        int swaps=0;
	        for(int i=0;i<s.length;i++){
	            if(s[i] == symbol && i%2 != 0) // we are using modulo to avoid situation where after we change digit, then the adjacent digit will be not the same number.
	                swaps++;
	        }
	        return swaps;
	    }
	}
	//time complexity for both is o(n) and space complexity is o(1)

}
//11100 10101 00111 10101
/*This is more likely to be math problem. First we should come up with the idea that if there are more I would say one biased digit, then it is
 * impossible to make alternating. If it is not, we can then make it. After that, we then, check if there is biased digit is on the even position
 * it is because if it is on the even position, it is inevitably meet with the same number so we just need to check how many are they.*/
 