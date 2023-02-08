package practicing;

public class PowerOfThree326 {
	
	class Solution {
		public boolean isPowerOfThree(int n) {
	        return n > 0 && 1162261467 % n == 0;
	    }
	}
	
}


//class Solution {
//    public boolean isPowerOfThree(int n) {
//        if (n < 1) {
//            return false;
//        }
//
//        while (n % 3 == 0) {
//            n /= 3;
//        }
//
//        return n == 1;
//    }
//    
//}

/*The above solution was so brilliant so right after I saw it, I had no hesitation to apply it.*/