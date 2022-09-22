package practicing;

public class Pow50 {

//	class Solution {
//		public double myPow(double x, int n) {
//			
//			if(n == 0 )return 1;
//			
//			long N = n;
//			
//			
//			if(N <0) {
//				x = 1/x;
//				N = -N;
//			}
//			
//			double ans = 1;
//			
//			for(long i = 0; i < N ; i++) {
//				ans = ans * x;
//			}
//				
//				
//			
//			
//			
//			return ans;
//			
//		}
//	}
	
	class Solution {
	    private double fastPow(double x , long n){
	        if( n == 0 )return 1.0;
	        
	        
	        double half = fastPow(x, n/2);
	        
	        if(n % 2 == 0){
	            return half * half;
	        }else{
	            return half * half * x;
	        }
	        
	    }
	    
	    public double myPow(double x, int n) {
	        long N = n;
	        if (N < 0) {
	            x = 1/x;
	            N = -N;
	        }
	        
	        return fastPow(x,N);
	        
	    }
	    
	}

}
/*Second answer allows us to have O(logn). Every time we run the recursion, it becomes half, half, and half. When n reaches 0 it returns and then it
 * process to next step. If the x's power is odd number, we can have the value by multiplying half (x*n/2) half(x*n/2) * x otherwise just half * half
 * By so, we could half the answer as O(logn).*/

