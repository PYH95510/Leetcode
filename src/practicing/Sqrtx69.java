package practicing;

public class Sqrtx69 {

	class Solution{
		public int mySqrt(int x) {
	        if(x<2)return x;
	        long num;
	        int mid, start = 2 , end = x/2; //this is the trick to set the end. The square root is always smaller than the x/2.
	        
	        while(start <= end) {
	        	mid = start+(end-start)/2;
	        	num = (long)mid*mid;
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
