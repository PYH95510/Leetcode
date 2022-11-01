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
	            return checkSwaps(s.toCharArray(),'1');
	        else if(zero > one)
	            return checkSwaps(s.toCharArray(),'0');
	        //else for odd number, just swap for both and then get the min number from either one.
	        else
	            return Math.min(checkSwaps(s.toCharArray(),'1'),checkSwaps(s.toCharArray(),'0'));
	    }
	    
	    public int checkSwaps(char[] s, char symbol){
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
