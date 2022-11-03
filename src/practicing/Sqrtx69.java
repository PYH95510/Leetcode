package practicing;

public class Sqrtx69 {

	class Solution{
		public int mySqrt(int x) {
	        if(x<2)return x;
	        long num;
	        int mid, start = 2 , end = x/2; //this is the trick to set the end. The square root is always smaller than the x/2.
	        
	        while(start <= end) {
	        	mid = start+(end-start)/2;
	        	num = (long)mid*mid; //this is needed to find square root without using built in library.
	        	if(num>x)end = mid-1;
	        	else if(num < x) { start = mid +1;
	        		
	        	}else {
	        		return mid;
	        	}
	        }
	        
	        return end;		
	    }
	}

}
/*This problem is based on binary search. I was pretty satisfied because I came up with the solution by myself. By iterating solution writing on the
 * paper. You can easily find  out what should be done. As I commented in the line, you would easily know what end = x/2 is supposed to be meaning.
 * once it is clear, it is very easy because rest of it is pretty much same as binary search. time complexity is O(log n) and space complexity is O(1).*/
 