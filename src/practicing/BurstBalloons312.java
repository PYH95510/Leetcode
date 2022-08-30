package practicing;

public class BurstBalloons312 {

	class Solution {
	    public int maxCoins(int[] nums) {
	         int n = nums.length;
	        int arr[] = new int[n+2];
	        arr[0] = arr[n+1] = 1;   // Giving padding of 1 to the corner elements
	        for(int i=1;i<=n;i++){
	            arr[i] = nums[i-1];   //final padded array
	        }
	       
	        
	    }
	    
	    
	}

}
