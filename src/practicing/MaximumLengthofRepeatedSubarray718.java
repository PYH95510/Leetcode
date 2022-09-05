package practicing;

public class MaximumLengthofRepeatedSubarray718 {

	class Solution {
	    public int findLength(int[] nums1, int[] nums2) {
	        //different order is not allowed
	        int ans = 0;
	        int dp[][] =new int [nums1.length+1][nums2.length+1];
	        for(int i = nums1.length -1 ; i >=0 ; i--){
	            for(int j = nums2.length -1; j>= 0; j--){
	                if(nums1[i]==nums2[j]){
	                    dp[i][j] = dp[i+1][j+1] +1 ;
	                    if( ans < dp[i][j]) ans = dp[i][j];
	                }
	            }
	        }
	        
	        
	        
	        return ans;
	    }
	    
	}

}
/*We iterate every single element in the nums2 element and compare each element in nums2 and if they are same, add 1 to ans, if they are not same
 * do not add. compare answer and dp[i][j] so if answer is smaller than the dp[i][j], update answer's value so keep answer's value always max.*/
